SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-django-rest-framework-social-oauth2-1.1.0-1.16.noarch.rpm"
RPM_HASH = "79328f8ebc364a82b86ac2d20cd048739a3727ead4d93c1132262f08c982a60636609cd8da1e658a2a7a74e3a82182820eb284ee9ebff1ae8bd1f8c758e73090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rest-framework-social-oauth2 \
python310-django-rest-framework-social-oauth2 \
python3dist-django-rest-framework-social-oauth2"

RDEPENDS:${PN} += "python-abi \
python310-django-braces \
python310-django-oauth-toolkit \
python310-djangorestframework \
python310-social-auth-app-django"

inherit rpm
