SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.27"

RPM_NAME = "python311-boto3-1.28.27-1.1.noarch.rpm"
RPM_HASH = "0f7d3e38bf153c8f3a42709cb47808f338c9beae1342333d60370b9812cc3c3e81d176c2494aad8f630a0a50840fe0a55d1fd8de5bfe3bec99df38131c097132"
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
