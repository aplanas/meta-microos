SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "2.1.1"

RPM_NAME = "python39-xapian-haystack-2.1.1-2.1.noarch.rpm"
RPM_HASH = "730d704796685d0bf3dc1508585d2ceca4fcc519d6b712fabfc4c4eebbb2d7a7768f724fc52df28423f44f2118f7684ffc1dc1832ae0493379bd2e7e6dc70de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xapian-haystack \
python39-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-haystack"

inherit rpm
