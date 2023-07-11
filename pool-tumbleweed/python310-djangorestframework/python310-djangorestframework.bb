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

RPM_NAME = "python310-djangorestframework-3.14.0-3.1.noarch.rpm"
RPM_HASH = "55d05e657f28f98a51efb1e6aba5b924cec71ff883831848a7d35a94564b6c24abe675cc9fa25fac04fd2cc20bd1cac777698788ce8ca0d99e250d7ebb3d15da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-djangorestframework \
python310-django-rest-framework \
python310-djangorestframework \
python3dist-djangorestframework"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
