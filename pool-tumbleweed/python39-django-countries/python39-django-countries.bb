SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "python39-django-countries-7.2.1-1.8.noarch.rpm"
RPM_HASH = "49f4d07dab73833ce82a61206626ff5354c17ccd345dbf03472663f269bfff77e0d3dc36889e6c1a76290a06732b5d573b36fd7a6a38a32d181b3e11d60a78d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-countries) \
python39-django-countries \
python3dist(django-countries)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
