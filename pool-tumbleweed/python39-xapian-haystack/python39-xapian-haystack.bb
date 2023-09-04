SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python39-xapian-haystack-3.1.0-1.1.noarch.rpm"
RPM_HASH = "d736b538256ea08bfac86d808691fa5b91221b964625fd8839b31a94c5daa2089bd03d3fd0ce54eda2180a013d0ac56f2b53725cad88b8ca6a010880d4539722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xapian-haystack \
python39-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-haystack \
python39-filelock"

inherit rpm
