SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "python310-django-cors-headers-3.13.0-1.3.noarch.rpm"
RPM_HASH = "c85c5d2ee5f12abd6964b1402629e3fb048584eb0655c99120594a77a319a060f6bbfe3a8664b65a5b476fe7b9de42fc54102640a49875fd2a2fe3d807e9e2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cors-headers \
python3.10dist-django-cors-headers \
python310-django-cors-headers \
python3dist-django-cors-headers"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
