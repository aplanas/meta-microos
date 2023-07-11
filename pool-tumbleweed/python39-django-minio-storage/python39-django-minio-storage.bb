SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.3"

RPM_NAME = "python39-django-minio-storage-0.5.3-1.2.noarch.rpm"
RPM_HASH = "f4f2ae078c27119e96ff6a81c6ada56162b4ef62a5dcfac7a66868fdf50ec839e9ec747278cf087311c1176af22b08da2aeb33dc9bcae50da6a334e02cc41b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-minio-storage \
python39-django-minio-storage \
python3dist-django-minio-storage"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-minio"

inherit rpm
