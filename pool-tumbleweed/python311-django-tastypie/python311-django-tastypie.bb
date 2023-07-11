SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "python311-django-tastypie-0.14.5-1.6.noarch.rpm"
RPM_HASH = "fa740906573e9194857e32d2cae20be04cb3c8e528754b20f01acf78ed324e69431682b3ac743516157632ce658b68fc18b0822813a88a824369f5d2ba57139c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tastypie \
python3.11dist-django-tastypie \
python311-django-tastypie \
python3dist-django-tastypie"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python-dateutil \
python311-python-mimeparse"

inherit rpm
