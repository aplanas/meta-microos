SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.14"

RPM_NAME = "python39-minio-7.1.14-1.4.noarch.rpm"
RPM_HASH = "13e79306606ae3c24d6badb81d9e252d05475b44d34aef9cef71e0247d95edc4c91f9c66e92a590486cdc1bc39e9957f6ac4058e4514dd6d0a7580d3c7a2758f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-minio \
python39-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python39-certifi \
python39-future \
python39-python-dateutil \
python39-pytz \
python39-urllib3"

inherit rpm
