SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "python310-django-model-utils-4.3.1-1.4.noarch.rpm"
RPM_HASH = "6e2e08866358b4f5c994fcc4f56bed273c28d9c7d43881e4d6b631013a33e74f25751c3cf2a01be5aaa684fb1d0c5e4685eec5b81b9d69c10b9fef8ce9d1c9f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-model-utils \
python310-django-model-utils \
python3dist-django-model-utils"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
