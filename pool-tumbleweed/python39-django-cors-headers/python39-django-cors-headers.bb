SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "python39-django-cors-headers-3.13.0-1.5.noarch.rpm"
RPM_HASH = "3c076f4bf871bc3c0508d13a16f2262e448f0000545b16a6c56b39f777a7ba8d64999bd3852a6628cac041fd52ecfd4a7710d07ff300c453aa48e6c63ed6c194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-cors-headers \
python39-django-cors-headers \
python3dist-django-cors-headers"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
