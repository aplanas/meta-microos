SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.47.0"

RPM_NAME = "python311-django-allauth-0.47.0-2.1.noarch.rpm"
RPM_HASH = "95876d197043c7bc3f07c56d7a7d44ae590455e531dcec8104234c195de2c4032e308e1d666a29bc6b3381655d1f51ffb710b8d7380c20730fd09c5bfa6ff70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth \
python3.11dist-django-allauth \
python311-django-allauth \
python3dist-django-allauth"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python3-openid \
python311-requests \
python311-requests-oauthlib"

inherit rpm
