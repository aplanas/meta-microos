SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-django-rest-framework-social-oauth2-1.1.0-1.16.noarch.rpm"
RPM_HASH = "f5bd007198e5b88cac8f8f1059a70ece2f2e0ee1bb81fb259ea39f2a71e2299dced4d88e03b617e5bbf5ccd5c424632493d5ef2c9d92c7ca6202aa7254f8d52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-social-oauth2 \
python3.11dist-django-rest-framework-social-oauth2 \
python311-django-rest-framework-social-oauth2 \
python3dist-django-rest-framework-social-oauth2"

RDEPENDS:${PN} += "python-abi \
python311-django-braces \
python311-django-oauth-toolkit \
python311-djangorestframework \
python311-social-auth-app-django"

inherit rpm
