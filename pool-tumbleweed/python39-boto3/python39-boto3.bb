SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.153"

RPM_NAME = "python39-boto3-1.26.153-1.1.noarch.rpm"
RPM_HASH = "b55cb10b2bcc1891ee68921018baca7a456eb795918a867afa1c1151af007515c9f44ec3a1118dc1186b62dbca3894b8231760af73152b118ee190f98a6043c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-boto3 \
python39-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-jmespath \
python39-s3transfer"

inherit rpm
