SUMMARY = "Django REST Framework (DRF) utilities"
DESCRIPTION = "Collection of utilities for working with Django REST Framework (DRF)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-django-rest-framework-braces-0.3.4-5.4.noarch.rpm"
RPM_HASH = "a9f7b6a3fe2995d03b0537716f6f7554d394e528f389cb2b7d7502d3c3502318795e127311161fc24832338b5a6128ec7496649a1fe49f2e2feec4c8bf2513af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-braces \
python3.10dist-django-rest-framework-braces \
python310-django-rest-framework-braces \
python3dist-django-rest-framework-braces"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-dateutils \
python310-djangorestframework \
python310-pytz \
python310-six"

inherit rpm
