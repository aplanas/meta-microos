SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python310-django-phonenumber-field-5.1.0-2.7.noarch.rpm"
RPM_HASH = "9d41eeb95213ed94916d89cdcd9705f2770b9853ee30b8ff0c596ccffa867da20d3a84ce08c19bba6bac96981dcd2cc1f7da7253fde0406054a40a4f40d19403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-phonenumber-field \
python3.10dist(django-phonenumber-field) \
python310-django-phonenumber-field \
python3dist(django-phonenumber-field)"

RDEPENDS:${PN} += "python(abi) \
python310-Babel \
python310-Django \
python310-phonenumbers"

inherit rpm
