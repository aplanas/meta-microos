SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python311-django-rest-invitations-0.1.2-2.8.noarch.rpm"
RPM_HASH = "a84627d31f7fdd28bd99b5852dff5bae52341cf2f8d0101011871dfbc7540edd4b37a690a4bcb631dc7da8b6a8eb3d09b2ed311929af629942c9e8bf225c1401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-invitations \
python3.11dist-django-rest-invitations \
python311-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python311-django-invitations \
python311-djangorestframework"

inherit rpm
