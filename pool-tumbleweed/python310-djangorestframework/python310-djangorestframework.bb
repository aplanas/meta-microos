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

RPM_NAME = "python310-djangorestframework-3.14.0-2.3.noarch.rpm"
RPM_HASH = "09bf7e3174052444c143b4d86427327c1b623dabc9fd4acea5239a3ff20655baee133c7fa92a0ea30ba8ae4320a146701fbb833788c9ba74e9e7dc5bbedd087c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework \
python3-djangorestframework \
python3.10dist(djangorestframework) \
python310-django-rest-framework \
python310-djangorestframework \
python3dist(djangorestframework)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
