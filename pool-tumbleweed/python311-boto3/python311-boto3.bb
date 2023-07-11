SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.153"

RPM_NAME = "python311-boto3-1.26.153-1.1.noarch.rpm"
RPM_HASH = "92d55f1614461e4288f815d12cb76494a9b6348ba33175722b6d3aa3fc6b8a91271da323ef4253371c25417d3041f07e95fb931a2285ad4a42e2022a2c91509c"
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
