SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "python311-django-countries-7.2.1-1.8.noarch.rpm"
RPM_HASH = "25950764b1a65f2be7d6b942f1e0d688dc7a684f736157e732dd14faa6276c71d1bbdf887791ec2c71e1e3c78c51d528bd66d98ae7acf6e5f359ba69f3d6f6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-countries \
python311-django-countries \
python3dist-django-countries"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
