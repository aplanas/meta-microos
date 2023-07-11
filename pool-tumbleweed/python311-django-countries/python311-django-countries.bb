SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "python311-django-countries-7.2.1-1.10.noarch.rpm"
RPM_HASH = "da5c4a92bb4a57f609f0b5f3fa6118131608b2362d0f6a2f2857cb27bbec2126548527d06aa28cc1780265bb2be4aed7c8cc370bb50061174a101b5000aaf36b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-countries \
python3.11dist-django-countries \
python311-django-countries \
python3dist-django-countries"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
