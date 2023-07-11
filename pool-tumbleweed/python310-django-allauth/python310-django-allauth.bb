SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.47.0"

RPM_NAME = "python310-django-allauth-0.47.0-2.1.noarch.rpm"
RPM_HASH = "af0c75732cceaae4d90708d21dce797f515f2162b6611161cabb40024893ce3f542f652d0be6ecf19ec157561489ec4d3f900e6b78b7f909055f2d4901ee4ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-allauth \
python310-django-allauth \
python3dist-django-allauth"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-python3-openid \
python310-requests \
python310-requests-oauthlib"

inherit rpm
