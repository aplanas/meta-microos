SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python39-django-rest-invitations-0.1.2-2.6.noarch.rpm"
RPM_HASH = "b220503d38387137e1bbe42d91c23149d89fe822e4d19e9265abf0a4bb867103e0ea75fa43cf2cdb3432490d4fc6a292181a5f1a0c8bfe44620e26403133e9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-rest-invitations) \
python39-django-rest-invitations \
python3dist(django-rest-invitations)"
RDEPENDS:${PN} += "python(abi) \
python39-django-invitations \
python39-djangorestframework"

inherit rpm
