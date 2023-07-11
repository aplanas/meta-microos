SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python39-django-invitations-1.9.3-3.7.noarch.rpm"
RPM_HASH = "c22bbb027b98bea5b8a497f4c3953cf982795dbb359c80ef030433e775c0d6727e7b6f3e3108df7d98f85b6d65b73ba9821d1bd12e6bd07c36bb2f487793e58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-invitations \
python39-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
