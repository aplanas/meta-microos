SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.3"

RPM_NAME = "python39-django-minio-storage-0.5.3-1.1.noarch.rpm"
RPM_HASH = "7a88f4859f886c807a05402e86dda219aef0bd046ccb032892ac39a115276d1ec174102fb0f04c6aeeba2951843ec328054e3f6461bdc114d0eb42fa5ca35d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-minio-storage) \
python39-django-minio-storage \
python3dist(django-minio-storage)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-minio"

inherit rpm
