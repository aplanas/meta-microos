SUMMARY = "Django REST Framework (DRF) utilities"
DESCRIPTION = "Collection of utilities for working with Django REST Framework (DRF)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-django-rest-framework-braces-0.3.4-5.6.noarch.rpm"
RPM_HASH = "907115805fd126ff0b7ebea6c752c12ae64b4ff2d287032881047aa4b6e6ad2d454357d1968d70aa48f2f815c2ddbf5904151d8f55a3f9bb9810422f68e7bfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rest-framework-braces \
python310-django-rest-framework-braces \
python3dist-django-rest-framework-braces"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-dateutils \
python310-djangorestframework \
python310-pytz \
python310-six"

inherit rpm
