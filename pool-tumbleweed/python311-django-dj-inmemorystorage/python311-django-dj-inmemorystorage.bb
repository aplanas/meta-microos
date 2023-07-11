SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-django-dj-inmemorystorage-2.1.0-4.8.noarch.rpm"
RPM_HASH = "c3891bc48a2096d5e21a368d69eca7afd69b6de0a45a76fdfe7645a2a0bf464bbefd8408c6929cc334586c1b636fa40fb419fb015c10e9384e95d6a596f80b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-dj-inmemorystorage \
python3.11dist-dj-inmemorystorage \
python311-django-dj-inmemorystorage \
python3dist-dj-inmemorystorage"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-six"

inherit rpm
