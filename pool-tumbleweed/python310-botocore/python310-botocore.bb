SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.163"

RPM_NAME = "python310-botocore-1.29.163-1.1.noarch.rpm"
RPM_HASH = "0aa56d98b9718cc956ad01fefe16a8927b5e0dde794ceeb11765e68246d24d36ec768b214396aa5248d28a67f2f214c6b125c15c2ace6280a698da2168bf43aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-botocore \
python310-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python310-jmespath >= 0.7.1 with python310-jmespath < 2.0.0 \
-python310-python-dateutil >= 2.1 with python310-python-dateutil < 3.0.0 \
python-abi \
python310-requests"

inherit rpm
