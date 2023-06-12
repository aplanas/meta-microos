SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.144"

RPM_NAME = "python39-boto3-1.26.144-1.1.noarch.rpm"
RPM_HASH = "2a0e43fc920a2355d97de47e2ba4db5db7ead6c2ea5e29f6abec0ae0ce10b6fcaf04fc17c1ef9d7619fed112afab29d1f5233e9369d6e3d1bc750a3e3898a1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(boto3) \
python39-boto3 \
python3dist(boto3)"
RDEPENDS:${PN} += "python(abi) \
python39-botocore \
python39-jmespath \
python39-s3transfer"

inherit rpm
