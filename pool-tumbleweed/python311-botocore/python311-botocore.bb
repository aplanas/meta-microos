SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.2"

RPM_NAME = "python311-botocore-1.31.2-1.1.noarch.rpm"
RPM_HASH = "0bf98d2913507a40037d6d9f8ca86beb54dc56ae33626d6974412356a984862746aad78f9ae223db9c4eed2d38ae27ffb91305bc6bd57016cedf88dd36b168d7"
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
