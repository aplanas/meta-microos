SUMMARY = "Django REST Framework (DRF) utilities"
DESCRIPTION = "Collection of utilities for working with Django REST Framework (DRF)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-django-rest-framework-braces-0.3.4-5.6.noarch.rpm"
RPM_HASH = "e05d7b4ff8fbb6082ff48b967f53cfbe8ce4c8c98661b58037b75123340d68de490184cd00e3a2dfa7e29f30bde00e1a1d0f6acc657454280cf3ae78bf1ebace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-braces \
python3.11dist-django-rest-framework-braces \
python311-django-rest-framework-braces \
python3dist-django-rest-framework-braces"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-dateutils \
python311-djangorestframework \
python311-pytz \
python311-six"

inherit rpm
