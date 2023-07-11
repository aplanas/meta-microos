SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "python311-django-cors-headers-3.13.0-1.5.noarch.rpm"
RPM_HASH = "0f9f88641e4f18e3ef862361390f092098401a43c37bc47b5e4c8e2704454499ad09df443f4f494b8d43fbe2c96abd6834ebf9ba49e561eb24791dddc487eddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cors-headers \
python3.11dist-django-cors-headers \
python311-django-cors-headers \
python3dist-django-cors-headers"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
