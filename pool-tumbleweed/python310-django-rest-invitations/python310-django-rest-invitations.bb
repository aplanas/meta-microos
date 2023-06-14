SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python310-django-rest-invitations-0.1.2-2.6.noarch.rpm"
RPM_HASH = "9095cf98c0dadca36da470e8821998c09f8283111166ab0e5dbb873a89e59c94b5a537b79ecd694b2d91ae8eadf27696bb6b9285e587d67cdb5d697f0fa85804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-invitations \
python3.10dist-django-rest-invitations \
python310-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python310-django-invitations \
python310-djangorestframework"

inherit rpm
