SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python39-django-phonenumber-field-5.1.0-2.7.noarch.rpm"
RPM_HASH = "81ee11756f75029c47ff8643c69d68658cebee7fbfe5c0d82bf2e32782abbdc0eb61324cfa92391df9fe3be60cff7abf01d5c53698cab9f73b887c27130b4e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-phonenumber-field \
python39-django-phonenumber-field \
python3dist-django-phonenumber-field"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-Django \
python39-phonenumbers"

inherit rpm
