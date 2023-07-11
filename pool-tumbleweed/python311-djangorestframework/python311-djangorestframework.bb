SUMMARY = "A REST Framework for Django"
DESCRIPTION = "Django REST framework is a library for building Web APIs. It is \
modular and the architecture can be customized, based on Django's \
class based views. \
 \
Web APIs built using REST framework are fully self-describing and web \
browseable. It also supports a wide range of media types, \
authentication and permission policies out of the box."
LICENSE = "BSD-2-Clause"

PV = "3.14.0"

RPM_NAME = "python311-djangorestframework-3.14.0-3.1.noarch.rpm"
RPM_HASH = "123f919dc520756f934a17a207466c2af1b8e2b5041b1c52f771f65daf3a6ca64a6330e7de38e46e043ede1e1dad2b8547eab908af3d8c940370c4dc2460d74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework \
python3-djangorestframework \
python3.11dist-djangorestframework \
python311-django-rest-framework \
python311-djangorestframework \
python3dist-djangorestframework"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
