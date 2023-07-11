SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "python310-django-cors-headers-3.13.0-1.5.noarch.rpm"
RPM_HASH = "e886e290b59381f4cf57729929ac9e1f55652b3586425bdcbaf57bc73fd86819980b71e5041b61d7278d279d72984208ad4ed8652e700f702ea38c129a226fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-cors-headers \
python310-django-cors-headers \
python3dist-django-cors-headers"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
