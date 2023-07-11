SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "python311-django-model-utils-4.3.1-1.4.noarch.rpm"
RPM_HASH = "1b78a9ff1827d6344129836596e35a31ecfac6533f88379cc2d5142c7cfd9dba80daa49c8704a7eef82bc740c418cb5fdba6a4b5f8a094841d0d4ed296f30e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-model-utils \
python3.11dist-django-model-utils \
python311-django-model-utils \
python3dist-django-model-utils"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
