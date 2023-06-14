SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "python39-django-model-utils-4.3.1-1.3.noarch.rpm"
RPM_HASH = "998c26e3712546db3b1dc264ce053bc07b83f2a1825afd4237fd245ef0ec890ebe28e86c6ffcaaa5f0f373009fda4facff1b6c1c8686567d2d6abd6b317f93d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-model-utils \
python39-django-model-utils \
python3dist-django-model-utils"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
