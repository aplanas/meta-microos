SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.27"

RPM_NAME = "python310-boto3-1.28.27-1.1.noarch.rpm"
RPM_HASH = "a474e5a8b7e96a5f7a44168876cae0f041251a58d3cf4e2bd4446c47dfe4347803480ee334e236622d35ec5783349e34244e224fdbe7ce5c9c011ef23bfdb278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-boto3 \
python310-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-jmespath \
python310-s3transfer"

inherit rpm
