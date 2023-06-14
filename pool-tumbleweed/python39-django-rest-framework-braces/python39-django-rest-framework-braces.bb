SUMMARY = "Django REST Framework (DRF) utilities"
DESCRIPTION = "Collection of utilities for working with Django REST Framework (DRF)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-django-rest-framework-braces-0.3.4-5.4.noarch.rpm"
RPM_HASH = "3e57046f47850c4fc2563d40739db4196e7eb148a9725286b2fa9f1e3c328eef953e6826e47478d970ddc638f5e9c2354f7e227e1d04514a8eb233feaf0ffb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rest-framework-braces \
python39-django-rest-framework-braces \
python3dist-django-rest-framework-braces"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-dateutils \
python39-djangorestframework \
python39-pytz \
python39-six"

inherit rpm
