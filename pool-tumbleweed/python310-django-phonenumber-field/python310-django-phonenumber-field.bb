SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python310-django-phonenumber-field-5.1.0-2.9.noarch.rpm"
RPM_HASH = "64abd92967e86b20e2083681b3617805f57438563b3bb29a3562eda9bed9ea4fb2f74077840cfca2567be6fa0cd2f11e79708d6c28c6a1b0973b80df21d431c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-phonenumber-field \
python310-django-phonenumber-field \
python3dist-django-phonenumber-field"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-Django \
python310-phonenumbers"

inherit rpm
