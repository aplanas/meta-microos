SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-django-rest-framework-social-oauth2-1.1.0-1.16.noarch.rpm"
RPM_HASH = "b00dbcdde8d7d5d5fb23cdf1009c5782726ab5e6921446d2a14a83ddf0bd03fb0b0ebf1fe10c6e285729c21ba28b6fc8072b0fe38038f47b379fd6b3ab407f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rest-framework-social-oauth2 \
python39-django-rest-framework-social-oauth2 \
python3dist-django-rest-framework-social-oauth2"

RDEPENDS:${PN} += "python-abi \
python39-django-braces \
python39-django-oauth-toolkit \
python39-djangorestframework \
python39-social-auth-app-django"

inherit rpm
