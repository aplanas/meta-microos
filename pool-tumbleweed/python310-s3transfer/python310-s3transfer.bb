SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python310-s3transfer-0.6.1-1.1.noarch.rpm"
RPM_HASH = "61f63f558a187dba2f891ad241a29a4df044163e6c489ee4b72157ad63d3779dce84172caac6107a6ed830198845d954011004a20ae5621452fdd0b478430d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-s3transfer \
python310-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-requests"

inherit rpm
