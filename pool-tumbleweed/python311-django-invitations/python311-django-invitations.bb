SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python311-django-invitations-1.9.3-3.5.noarch.rpm"
RPM_HASH = "26acbe23e745aee1f168980ff97c8d95dcd5c81dda233185c844d1216cd98586eb729af09e8cf04b1a85d3bdc909948f658658ef1d9117ae37d6d4a3be82fb23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-invitations \
python311-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
