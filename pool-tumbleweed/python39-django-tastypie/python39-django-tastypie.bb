SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "python39-django-tastypie-0.14.5-1.6.noarch.rpm"
RPM_HASH = "16c53bc96d48d6c9befdcd966bfe821ebfb879427eca0cd41b8ada28d34ff2541f06162ef4f22ecd6fbec3787ca89b4b408460177e07dfd5890667b96f2001f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-tastypie \
python39-django-tastypie \
python3dist-django-tastypie"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python-dateutil \
python39-python-mimeparse"

inherit rpm
