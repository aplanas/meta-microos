SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.14"

RPM_NAME = "python310-minio-7.1.14-1.4.noarch.rpm"
RPM_HASH = "6fe0c2cce78f921c5a6502989e44f076e0306a727d65f6b11b39c36799d3977cd828d0648eca156d91978c92d1d7568ad4a681baab4d8254c1cfce8a9e3ff098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-minio \
python310-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python310-certifi \
python310-future \
python310-python-dateutil \
python310-pytz \
python310-urllib3"

inherit rpm
