SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-django-dj-inmemorystorage-2.1.0-4.6.noarch.rpm"
RPM_HASH = "fedd56dc4795aa00058abd8b0dffa9ee7990e99a64583b40883c3c19420cd11af02ee548519faf26235b24761fe86dc5c26d3c91ab82f2456df5d294503aa94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dj-inmemorystorage) \
python39-django-dj-inmemorystorage \
python3dist(dj-inmemorystorage)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-six"

inherit rpm
