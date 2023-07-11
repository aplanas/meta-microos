SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python39-django-rest-invitations-0.1.2-2.8.noarch.rpm"
RPM_HASH = "90c96f76699b7ee5414c3f75e2168209dc0b6310c1752617c8272d4f28f867ae88193b2275c80f60336d3bcc24014c7a50b0373cb5fc0451a4dfa93f8e8bbc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rest-invitations \
python39-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python39-django-invitations \
python39-djangorestframework"

inherit rpm
