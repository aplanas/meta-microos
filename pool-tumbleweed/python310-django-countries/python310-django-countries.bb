SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "python310-django-countries-7.2.1-1.10.noarch.rpm"
RPM_HASH = "a34fde5f68b0173d71478f9721127f037aa5063ab5814ded659f4f7ddba028eee25a123afa82312caaa39943e772420250efa7d3f03e5a78016903fdb6a8fc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-countries \
python310-django-countries \
python3dist-django-countries"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
