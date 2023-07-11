SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "python39-django-model-utils-4.3.1-1.4.noarch.rpm"
RPM_HASH = "af4007f3aeb60b23d9538be5ae7dad2964d9fcc8adbb63d5aa17b7f8beb76daeb87cee709bd1024d72c1392fdbcfb06b12a31b9b7d44d0a0686d2e2564894bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-model-utils \
python39-django-model-utils \
python3dist-django-model-utils"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
