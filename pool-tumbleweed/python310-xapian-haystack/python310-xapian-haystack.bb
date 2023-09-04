SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python310-xapian-haystack-3.1.0-1.1.noarch.rpm"
RPM_HASH = "80007ca90df098c9ca951f02f7bbf861e46efef9c6d3bb7e421bf791d79ef689e350515846d0b5c8a1f02f83198a51b8fa534a82a03cf2430d95c29c13638568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xapian-haystack \
python310-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-haystack \
python310-filelock"

inherit rpm
