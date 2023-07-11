SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.3"

RPM_NAME = "python310-django-minio-storage-0.5.3-1.2.noarch.rpm"
RPM_HASH = "4235af4b61dbf82ad1f10510217642d3a3bacce098f316de51db1c07c653d40214da2eb3c3fe0d8da0befeed701443dc3367e284b8e6322433f37188c4d76cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-minio-storage \
python310-django-minio-storage \
python3dist-django-minio-storage"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-minio"

inherit rpm
