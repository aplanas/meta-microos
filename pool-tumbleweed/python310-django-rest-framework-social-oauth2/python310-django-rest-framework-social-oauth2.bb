SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-django-rest-framework-social-oauth2-1.1.0-1.15.noarch.rpm"
RPM_HASH = "0471738a5a0d74566f0d46b9586d2de42f7efd234793a9d27ccb076a4de7289f410c38d379af767d0f4d547c92ccf8286eb4b2de4c478f085eb97445b7d4e9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-social-oauth2 \
python3.10dist-django-rest-framework-social-oauth2 \
python310-django-rest-framework-social-oauth2 \
python3dist-django-rest-framework-social-oauth2"

RDEPENDS:${PN} += "python-abi \
python310-django-braces \
python310-django-oauth-toolkit \
python310-djangorestframework \
python310-social-auth-app-django"

inherit rpm
