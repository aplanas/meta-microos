SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.47.0"

RPM_NAME = "python310-django-allauth-0.47.0-1.8.noarch.rpm"
RPM_HASH = "3ae5d4fd127c26c2d9cf454692bd74b290450a196dd6c3863749772e6e81cf617deb5d5c23b9de0e00edbe3ab3b4560a495de13b78241822b54025ec1f0b660c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth \
python3.10dist(django-allauth) \
python310-django-allauth \
python3dist(django-allauth)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-python3-openid \
python310-requests \
python310-requests-oauthlib"

inherit rpm
