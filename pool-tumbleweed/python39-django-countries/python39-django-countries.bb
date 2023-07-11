SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "python39-django-countries-7.2.1-1.10.noarch.rpm"
RPM_HASH = "bc294239ec27eb9969a38ffbe90906412d733795e9d4876809ba8f8c162e3d3b23579d5a5e3b0d66126a1ccff133a6a0e2556197ec0b70c17266ccfa8cf62bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-countries \
python39-django-countries \
python3dist-django-countries"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
