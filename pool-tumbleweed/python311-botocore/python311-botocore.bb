SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.163"

RPM_NAME = "python311-botocore-1.29.163-1.1.noarch.rpm"
RPM_HASH = "19d35ab728d9d937ea59b675b5c722b91d7af26a13f63b9efe61f36a951fca30ab7a5a21aa9f71ded6ed91ab057a456848326774b66d9235d8ca20d955a79b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-botocore \
python3.11dist-botocore \
python311-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python311-jmespath >= 0.7.1 with python311-jmespath < 2.0.0 \
-python311-python-dateutil >= 2.1 with python311-python-dateutil < 3.0.0 \
python-abi \
python311-requests"

inherit rpm
