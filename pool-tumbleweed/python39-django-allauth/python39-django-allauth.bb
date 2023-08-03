SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.54.0"

RPM_NAME = "python39-django-allauth-0.54.0-1.1.noarch.rpm"
RPM_HASH = "3e321c7dda6c92e81758dfecc6a64dcb546544417955e0c79f9fa5be726d4f9036cf4368c8c36ab1ffb025b17265dfd9a3fc89b95aefa555d4cac834cb4d1176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-allauth \
python39-django-allauth \
python3dist-django-allauth"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python3-openid \
python39-requests \
python39-requests-oauthlib"

inherit rpm
