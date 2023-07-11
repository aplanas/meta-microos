SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-django-rest-framework-client-0.1.1-4.8.noarch.rpm"
RPM_HASH = "06db0fd3c2e1dd583ef56ac05690c46892237ed2e066afd6411aee291ff3a3a0d67fde8eb10ebc3bf296ec14ca4af6f6d0bc7b9236be1789df223267b72d3f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rest-framework-client \
python310-django-rest-framework-client \
python3dist-django-rest-framework-client"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-requests"

inherit rpm
