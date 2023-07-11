SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-django-haystack-3.2.1-2.1.noarch.rpm"
RPM_HASH = "9476adf6148c0f72ff6195524605de3669cf3ff202a5245f72906a462149a3b2048f12761ff3fc4487e136c7815e02a996551fcee794d78685e8a7f5d2bdf3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-haystack \
python39-django-haystack \
python3dist-django-haystack"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
