SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python311-django-invitations-1.9.3-3.7.noarch.rpm"
RPM_HASH = "3dcbf6dee6ca396a9c368fed7504034585648e2d5a2de756b5c05b38b8755140c0b208a02e93e88e6c49ebe398319a6bb98c112c5edac8340536f22fa7bd8761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-invitations \
python3.11dist-django-invitations \
python311-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
