SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.36"

RPM_NAME = "python39-boto3-1.28.36-1.1.noarch.rpm"
RPM_HASH = "cd77bc0eb5ab268ea859e57653df35eec509b58a2610f25f1e4bf20806c0371e7a2588e209244a8b8c496b949508fd5e45164c5e2ee6e8fd3794788d0a5d4235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-boto3 \
python39-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-jmespath \
python39-s3transfer"

inherit rpm
