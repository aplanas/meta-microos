SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python310-django-invitations-1.9.3-3.7.noarch.rpm"
RPM_HASH = "51508bce48d37632b15b3183092217ead53f35ef3a567579ff2c9137cbcddbc27994d8d6bb6b280653e6f032d5a51ecc300f9bb73079d6dd62f986ebd639d2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-invitations \
python310-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
