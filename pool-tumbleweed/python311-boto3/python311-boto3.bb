SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.36"

RPM_NAME = "python311-boto3-1.28.36-1.1.noarch.rpm"
RPM_HASH = "ec29f368ecd73f46bd8db314a65d076a09c131d1ef7d47807c787f44b0108989b1ff5f5ee51734d936e5595bf3df66ba6a5a1c114426139ac8cf7a40c54ad4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boto3 \
python3.11dist-boto3 \
python311-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-jmespath \
python311-s3transfer"

inherit rpm
