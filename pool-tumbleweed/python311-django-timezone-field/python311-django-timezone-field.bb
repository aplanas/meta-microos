SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "5.1"

RPM_NAME = "python311-django-timezone-field-5.1-1.1.noarch.rpm"
RPM_HASH = "85d9ce9058dd1873e2981cea543059f21a0a18cc35900afd5645b9e9db0fb3f5e4b203a5fd311eeed224bbfb746cede2219a9b6516f0d6369fbc3da66ab4f538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-timezone-field \
python3.11dist-django-timezone-field \
python311-django-timezone-field \
python3dist-django-timezone-field"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pytz"

inherit rpm
