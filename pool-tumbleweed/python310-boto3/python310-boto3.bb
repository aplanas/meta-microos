SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.36"

RPM_NAME = "python310-boto3-1.28.36-1.1.noarch.rpm"
RPM_HASH = "0da74b29d07522f65933bf06a7669a7e6a163368fdd0e9101b486e7352a8b7c00dbc11d359f4ccbff456e8000119e8cc7b255fb54ba24bb029e29a05ac1b249f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-boto3 \
python310-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-jmespath \
python310-s3transfer"

inherit rpm
