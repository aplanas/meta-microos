SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "python310-django-countries-7.2.1-1.8.noarch.rpm"
RPM_HASH = "b26b14aabaae16b4dae4e1f27565d56717afbb9f76d4d91041126f04eb2c7982f0135bdc4d9c5bf9f9d331c03b2fb86524e91d29a525e63a9f6f6cdedd34227d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-countries \
python3.10dist(django-countries) \
python310-django-countries \
python3dist(django-countries)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
