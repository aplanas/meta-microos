SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python39-django-phonenumber-field-5.1.0-2.9.noarch.rpm"
RPM_HASH = "4ebd103b4cdfb6eca465d1a3b3114e6eb52d2c475c8f229e70315cd67d7630dae2db2927b796cd5605cd2fa274bc33e9928a36cdc743b30ebec2ab1577e1d214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-phonenumber-field \
python39-django-phonenumber-field \
python3dist-django-phonenumber-field"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-Django \
python39-phonenumbers"

inherit rpm
