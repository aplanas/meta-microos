SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.153"

RPM_NAME = "python310-boto3-1.26.153-1.1.noarch.rpm"
RPM_HASH = "5505bd15d32b0a1ce7506ee134c3d525ceb69a654568bfd6db163febca817f6b1d22b4f9034ef4a36d8f0bd5eb3a937051d445048ed7968f62fbeb8c1da809c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-boto3 \
python310-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-jmespath \
python310-s3transfer"

inherit rpm
