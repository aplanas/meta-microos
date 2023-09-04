SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python311-xapian-haystack-3.1.0-1.1.noarch.rpm"
RPM_HASH = "71b0c659e8b05a8ac93ec6cf104e3dd524bc316f38e82f94cb6799b70c9e12d5755e403f57a41d3344e5a313a8ccda30fd9b6a97cb2c66214764501de7930428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapian-haystack \
python3.11dist-xapian-haystack \
python311-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-haystack \
python311-filelock"

inherit rpm
