SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-django-dj-inmemorystorage-2.1.0-4.8.noarch.rpm"
RPM_HASH = "bf67ddeb079957c0c7537e037f376301680e8c3e5a2223a68a75a2be761439d11217e4477d3eb4414ca2c0c571e02b7f2ec3ba41ca0792e5ef9bbd3e246bdcf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dj-inmemorystorage \
python310-django-dj-inmemorystorage \
python3dist-dj-inmemorystorage"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-six"

inherit rpm
