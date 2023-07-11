SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.47.0"

RPM_NAME = "python39-django-allauth-0.47.0-2.1.noarch.rpm"
RPM_HASH = "be792a0ec4c7013f0a7b10f53c493a82addde3269f0051e3562226cfdc06483ed83f36cd012ae194e3a411c5f95a37059d8b794cb931a13f676553088429eda1"
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
