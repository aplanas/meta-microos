SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "2.1.1"

RPM_NAME = "python311-xapian-haystack-2.1.1-2.1.noarch.rpm"
RPM_HASH = "498dc75c1370867a49c2502862f329b7824a92783e272e8eea4c4370f55b5ee2cdbfa94f43ee30a0664676b5fe6fc2d6f0578d9e8e3d35e710b634323b2f30b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapian-haystack \
python3.11dist-xapian-haystack \
python311-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-haystack"

inherit rpm
