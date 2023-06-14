SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python310-django-invitations-1.9.3-3.5.noarch.rpm"
RPM_HASH = "f8e01473a071999b303bea93a203a1551cb3afbff6c4d72f0ea1d554a7577ae1583d47e9388a96b7db21c93fd8be766402961631a754c0c8e91d3e0b19506f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-invitations \
python3.10dist-django-invitations \
python310-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
