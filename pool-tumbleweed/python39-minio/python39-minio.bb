SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.1.16"

RPM_NAME = "python39-minio-7.1.16-1.1.noarch.rpm"
RPM_HASH = "cfef38b3a7a81c72904ffe43542f62752b933b4b26adf23e7260411d43bea6e661e553bf2a8000ccd43fd4e3d8596923f70eb77b6206d6c5e3c00ce5d369afc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-minio \
python39-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python39-certifi \
python39-urllib3"

inherit rpm
