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

RPM_NAME = "python39-djangorestframework-3.14.0-3.1.noarch.rpm"
RPM_HASH = "d441d880ba3acc38c105662145d4a3c9f275769bf73c039bc3306b2cdda2fd68189630735654d0bb184464c295a9437715b55120a500c8252745e53ff4891801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-djangorestframework \
python39-django-rest-framework \
python39-djangorestframework \
python3dist-djangorestframework"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
