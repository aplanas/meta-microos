SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-django-dj-inmemorystorage-2.1.0-4.8.noarch.rpm"
RPM_HASH = "a3fce682ac69e6962c89c29faa72d89b12cd0b4b5d11f20d56ae778bb3616a32c181d8012252c9d07976e166b063b89eeeef0dd2af7eb632f2c4616899796a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dj-inmemorystorage \
python39-django-dj-inmemorystorage \
python3dist-dj-inmemorystorage"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-six"

inherit rpm
