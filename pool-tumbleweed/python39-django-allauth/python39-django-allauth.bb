SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "0.47.0"

RPM_NAME = "python39-django-allauth-0.47.0-1.8.noarch.rpm"
RPM_HASH = "80476ee6bc7482511185364b0865f67997b245f11cd906310a10e471027790880911a6d8ce017fe0e5af54cc37531daf2ed0ad15f98871c3520576181e975c04"
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
