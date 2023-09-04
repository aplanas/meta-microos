SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.27"

RPM_NAME = "python311-botocore-1.31.27-1.1.noarch.rpm"
RPM_HASH = "6e33830ba76db5cb282d55450fab084c5e31231c4495619d3ddcffa5e89d9851387f8586ac7118e1f8a07efff5fed8cae74fa5a09bd7fc7a5d42417a437528ad"
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
