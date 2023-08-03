SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.54.0"

RPM_NAME = "python311-django-allauth-0.54.0-1.1.noarch.rpm"
RPM_HASH = "8ec160e34cba655ecc6dae8362622b84e99682a641e722ae6162d22f9209b44cc8d609e87502afac0b349e58a77fb5786cb137e2fea9fbc1b31796dc0ab98f02"
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
