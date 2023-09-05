SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.36"

RPM_NAME = "python310-botocore-1.31.36-1.1.noarch.rpm"
RPM_HASH = "c061cda8513f2b22a5673c6574580f6b3cef878ffae0bf924feb0a4deb6768fa78e4293d0f2430b30cdf2d12869ab19cbaa88b95f485af937d80844b08f5dd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-botocore \
python310-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python310-jmespath >= 0.7.1 with python310-jmespath < 2.0.0 \
-python310-python-dateutil >= 2.1 with python310-python-dateutil < 3.0.0 \
python-abi \
python310-requests"

inherit rpm
