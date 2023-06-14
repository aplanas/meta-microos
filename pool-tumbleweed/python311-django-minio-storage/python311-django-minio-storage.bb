SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0 | MIT"

PV = "0.5.3"

RPM_NAME = "python311-django-minio-storage-0.5.3-1.1.noarch.rpm"
RPM_HASH = "ec6499a2ef509e40124600c4e7e0a19007b1f4fe5d7902de531d43ef3ad8058535e75a9560b149078b4469859acba17173424bab1caa56c093601bd45979bf02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-minio-storage \
python311-django-minio-storage \
python3dist-django-minio-storage"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-minio"

inherit rpm
