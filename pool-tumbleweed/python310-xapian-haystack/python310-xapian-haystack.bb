SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "2.1.1"

RPM_NAME = "python310-xapian-haystack-2.1.1-2.1.noarch.rpm"
RPM_HASH = "f8bfa209437197f3bfb992e19380a546a8d16fe5b5f0d8d067f230e449c302d6f1659342e50027fabe047277868938dc5f0a24b9c2edd842b90afb3a79209c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xapian-haystack \
python310-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-haystack"

inherit rpm
