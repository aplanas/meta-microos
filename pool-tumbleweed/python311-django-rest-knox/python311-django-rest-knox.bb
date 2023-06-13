SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-django-rest-knox-4.2.0-1.7.noarch.rpm"
RPM_HASH = "c58bcae7fb87a5914218187587b151fd7a7997d22edc9a55d061619d18b601e8a098789041d254a77f34941397409460ecc772dbda3e818c7917389003ed9f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-rest-knox) \
python311-django-rest-knox \
python3dist(django-rest-knox)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-cryptography \
python311-djangorestframework"

inherit rpm
