SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "python311-django-tastypie-0.14.5-1.4.noarch.rpm"
RPM_HASH = "679e70a5752eee885013069626b590c271e27c95e1665a9839f14fe4a9b9443a95aed108a0c405da2ed5e158f98c50a53d24ca5222fe1d7ccd541f5e5919ee18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-tastypie) \
python311-django-tastypie \
python3dist(django-tastypie)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-python-dateutil \
python311-python-mimeparse"

inherit rpm
