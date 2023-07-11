SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python39-django-extensions-3.2.3-2.1.noarch.rpm"
RPM_HASH = "dcae9ff44188f435aba1dd9e31b91fefa044ed8f91b05ddbd027fa7796109cd399905881440067169610922ef7de7f71f568e4a5eaa5054460d41425b5d6e7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-extensions \
python39-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
