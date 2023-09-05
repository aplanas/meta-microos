SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.36"

RPM_NAME = "python311-botocore-1.31.36-1.1.noarch.rpm"
RPM_HASH = "ed6801393edab6d074cf774d17f802feeb21e0ac06b354cc5bf395c073eb683d7b5216ed9cae61eca3e62c60fd9116f65a8fc7e80dc8fffb27c3faabc8149f2d"
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
