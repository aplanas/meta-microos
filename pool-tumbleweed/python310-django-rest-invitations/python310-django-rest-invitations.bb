SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python310-django-rest-invitations-0.1.2-2.8.noarch.rpm"
RPM_HASH = "e13cb9ccc0258ea31b55f65c55fe2b0675f1dc09433144724edb95fad75eb2b3542313514b4f0a50c61ed117701b9437d3103729dc07f311cc3a9b5598623539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rest-invitations \
python310-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python310-django-invitations \
python310-djangorestframework"

inherit rpm
