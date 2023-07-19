SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.2"

RPM_NAME = "python39-boto3-1.28.2-1.1.noarch.rpm"
RPM_HASH = "f7eded20893d46a39df7e44cea5b94440917b220936c202b9e0157d8054df62ee387949865040c65f97c4a349f4c58ad740f018bcd29a45ea76d08e106565353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-boto3 \
python39-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-jmespath \
python39-s3transfer"

inherit rpm
