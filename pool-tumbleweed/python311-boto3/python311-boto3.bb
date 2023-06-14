SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.144"

RPM_NAME = "python311-boto3-1.26.144-1.1.noarch.rpm"
RPM_HASH = "945659e6896c27684089119bd732e5ccc18fb1b9f8cd8b49e37a59febc4b121557db310170bd33d6fa230180e22d77de56ddd80f972c3e8d602a24d9008465ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-boto3 \
python311-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-jmespath \
python311-s3transfer"

inherit rpm
