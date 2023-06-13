SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-django-rest-framework-social-oauth2-1.1.0-1.15.noarch.rpm"
RPM_HASH = "d4a2f0e38b33ee2bea59bb80d7b0da3b6de97b000b3725c569b737148b354ab05ce065fe0c486e40e00c874d4b189f643817fb9641091d3b4e93eeda54580f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-rest-framework-social-oauth2) \
python311-django-rest-framework-social-oauth2 \
python3dist(django-rest-framework-social-oauth2)"

RDEPENDS:${PN} += "python(abi) \
python311-django-braces \
python311-django-oauth-toolkit \
python311-djangorestframework \
python311-social-auth-app-django"

inherit rpm
