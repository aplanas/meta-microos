SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python39-django-appconf-1.0.5-2.1.noarch.rpm"
RPM_HASH = "473a314850a930a4b3a92b43188ff05220d1062baf27d99d467fdd6eefc92c7aaf1b21768348fc43e57c9f457a5a1cdaffcd456e7548735c5ce28e362b93c4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-appconf \
python39-django-appconf \
python3dist-django-appconf"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
