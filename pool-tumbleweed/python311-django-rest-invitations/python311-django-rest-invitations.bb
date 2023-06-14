SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python311-django-rest-invitations-0.1.2-2.6.noarch.rpm"
RPM_HASH = "0f6c87f88db095daf7f9c663125d92c5abc2848b6f2a26411b587b09d4e0a602b78389bd733781236b322d3e5d275f33ab6803855643bae0db97119588b2300f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-rest-invitations \
python311-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python311-django-invitations \
python311-djangorestframework"

inherit rpm
