SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "python310-django-tastypie-0.14.5-1.6.noarch.rpm"
RPM_HASH = "f2bc5a5d9158197ce11bcaad650842ef765833c8bb664cffad5cf7a2973f2807ef5cb2d551af05035c2a774f13bc28b788b7d668163146deab9ba503481250c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-tastypie \
python310-django-tastypie \
python3dist-django-tastypie"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-python-dateutil \
python310-python-mimeparse"

inherit rpm
