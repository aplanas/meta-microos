SUMMARY = "Django REST Framework (DRF) utilities"
DESCRIPTION = "Collection of utilities for working with Django REST Framework (DRF)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-django-rest-framework-braces-0.3.4-5.6.noarch.rpm"
RPM_HASH = "b5262c7a31e7a4dd75678b6e3a29ea5c56fcb60f3e8928b28ba74ffd7e6516ec53d9e81a755b18260928eb4e82bb6ad131031ed260e14be0851592e72c0e7f42"
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
