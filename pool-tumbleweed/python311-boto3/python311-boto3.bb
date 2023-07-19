SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.2"

RPM_NAME = "python311-boto3-1.28.2-1.1.noarch.rpm"
RPM_HASH = "7e4ef8d3b7e7f95b4ca18f424178fa7f3c693eeb8be4de0c5f2bba1a53d94709c875ddd70b69a191eaff88c0ac8f1dfbdc5fcb507c01a4921400cba7d608d30f"
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
