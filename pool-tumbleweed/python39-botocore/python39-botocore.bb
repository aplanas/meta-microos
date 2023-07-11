SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.163"

RPM_NAME = "python39-botocore-1.29.163-1.1.noarch.rpm"
RPM_HASH = "22abbe00ac70bd5e0c7a5e3d425514a7f444b2098e14adf03166cf2272273eb2677684a81e28da23622796ff3ed4df3d9c04ceabc19a734d3e5457be063eff82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-botocore \
python39-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python39-jmespath >= 0.7.1 with python39-jmespath < 2.0.0 \
-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3.0.0 \
python-abi \
python39-requests"

inherit rpm
