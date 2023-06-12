SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python310-django-formtools-2.4.1-1.1.noarch.rpm"
RPM_HASH = "c9dee3ab6b4c1b819ee24d6052a5c0f2eaf6f8669ff7e103a3bf494e7395581ecf5a0087ab9e5839454b7b1e42099bb98bdcefc33442687917093298a8db0c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-formtools \
python3.10dist(django-formtools) \
python310-django-formtools \
python3dist(django-formtools)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
