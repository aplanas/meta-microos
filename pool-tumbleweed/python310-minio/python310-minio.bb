SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.14"

RPM_NAME = "python310-minio-7.1.14-1.2.noarch.rpm"
RPM_HASH = "8bc834ec47f432173e7f9a5ab7860bf24ba73de52bf451fb7e6a1005d4cc1f5724b9200c5bf457ab9013951e2d9303e2ebfab140d81f4d638948e75629b172cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minio \
python3.10dist(minio) \
python310-minio \
python3dist(minio)"
RDEPENDS:${PN} += "python(abi) \
python310-certifi \
python310-future \
python310-python-dateutil \
python310-pytz \
python310-urllib3"

inherit rpm
