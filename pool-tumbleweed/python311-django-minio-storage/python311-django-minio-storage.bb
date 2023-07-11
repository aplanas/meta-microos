SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.3"

RPM_NAME = "python311-django-minio-storage-0.5.3-1.2.noarch.rpm"
RPM_HASH = "348090841694fac4cbee2a7204292b9312d8ffc2111da83a571ebdddcc41bbdbc2f6742d45af3d801f48832e044d3b2492f2e841dc0dd3e24ee4b635ecc68d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-minio-storage \
python3.11dist-django-minio-storage \
python311-django-minio-storage \
python3dist-django-minio-storage"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-minio"

inherit rpm
