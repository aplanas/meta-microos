SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "2.1.1"

RPM_NAME = "python310-xapian-haystack-2.1.1-1.11.noarch.rpm"
RPM_HASH = "01ecd29e0ce2c677a7a7a840b5d61f840c18a58ab8a882350aa2b82b831b1649cca25fcc4fef2356cd3a2d495429df0c9b78066c8ff9b63554eee96bec5be194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapian-haystack \
python3.10dist(xapian-haystack) \
python310-xapian-haystack \
python3dist(xapian-haystack)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-django-haystack"

inherit rpm
