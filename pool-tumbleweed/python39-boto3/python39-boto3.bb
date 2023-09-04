SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.28.27"

RPM_NAME = "python39-boto3-1.28.27-1.1.noarch.rpm"
RPM_HASH = "df0201804cfbe9e83948c1e5416cad3123394f41575f86d968c252118b81b8c10a10386d86d46faa05d42a501ff10849768a5986f47cc4062cc3201fc84d15a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-boto3 \
python39-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-jmespath \
python39-s3transfer"

inherit rpm
