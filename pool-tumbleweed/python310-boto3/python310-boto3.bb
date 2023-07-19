SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.2"

RPM_NAME = "python310-boto3-1.28.2-1.1.noarch.rpm"
RPM_HASH = "6ad0857754433c828c7b7c25c710d5c1458159c1130e815c9b334d3c43948d4531025fe3cfb4d24d1331ffca80ee432094631abc01cd5930adac7717f031d675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-boto3 \
python310-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-jmespath \
python310-s3transfer"

inherit rpm
