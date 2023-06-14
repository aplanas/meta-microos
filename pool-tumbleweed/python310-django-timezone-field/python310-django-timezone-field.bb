SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python310-django-timezone-field-5.0-1.4.noarch.rpm"
RPM_HASH = "265ccbce626c03a41023a61456e8e482c0971c7debbfafa2f00bf88d3660d42fcdd75c01af01e1a302609aba6770ea041878ed835ac4a96c3839db1d6ca0b6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-timezone-field \
python3.10dist-django-timezone-field \
python310-django-timezone-field \
python3dist-django-timezone-field"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pytz"

inherit rpm
