SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python310-django-formtools-2.4.1-1.3.noarch.rpm"
RPM_HASH = "3b5933ce5694385f785719023d79a712eb21a9e474eca6e2e08d3577453ddde507b4e3933647386121a8467ef074932c71e6898be438c119b07fc367561d51c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-formtools \
python310-django-formtools \
python3dist-django-formtools"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
