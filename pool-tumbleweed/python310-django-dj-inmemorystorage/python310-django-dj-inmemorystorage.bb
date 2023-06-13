SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-django-dj-inmemorystorage-2.1.0-4.6.noarch.rpm"
RPM_HASH = "3876bf08755060f1e33b0f864e17d926ba05c8a14002a05e70fa2358584357be7fe972135ce0de71638cc5cb8be19ab7f4b449b2a8fd82a593334c970597a3f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-dj-inmemorystorage \
python3.10dist(dj-inmemorystorage) \
python310-django-dj-inmemorystorage \
python3dist(dj-inmemorystorage)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-six"

inherit rpm
