SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python311-django-phonenumber-field-5.1.0-2.9.noarch.rpm"
RPM_HASH = "51858861214f1616f82a2232380699268691160a0fccc17fed74ad2df7618a62aa826eed98c54660b74eb0b963e8c670bd772f1b49f068114dd6d18a04b7dad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-phonenumber-field \
python3.11dist-django-phonenumber-field \
python311-django-phonenumber-field \
python3dist-django-phonenumber-field"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-Django \
python311-phonenumbers"

inherit rpm
