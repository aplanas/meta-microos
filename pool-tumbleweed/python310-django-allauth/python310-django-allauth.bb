SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.54.0"

RPM_NAME = "python310-django-allauth-0.54.0-1.1.noarch.rpm"
RPM_HASH = "383500a701ad6227d97a6caafb2ccf27074240615ec15c7850db5b03dc5d097d1117548c5bca261f0d987ecf7043db712ce03618b519842f5c6f98278b6d83f1"
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
