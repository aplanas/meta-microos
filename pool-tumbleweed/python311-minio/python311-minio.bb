SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.14"

RPM_NAME = "python311-minio-7.1.14-1.4.noarch.rpm"
RPM_HASH = "9a5e8098683f5d62f6c068767bc2540722f599210749ae3ba6a92c7584f5c490aee5305061b16a34d91ce647232ea985a62aa1e11a97fa12263ac32529581b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minio \
python3.11dist-minio \
python311-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python311-certifi \
python311-future \
python311-python-dateutil \
python311-pytz \
python311-urllib3"

inherit rpm
