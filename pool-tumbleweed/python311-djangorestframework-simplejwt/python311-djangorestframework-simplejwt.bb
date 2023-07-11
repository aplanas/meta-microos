SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python311-djangorestframework-simplejwt-4.6.0-1.12.noarch.rpm"
RPM_HASH = "23242ff362aa1d61669c03840df344dff19d6d74a5a13f7674450366122f6c2c6ebe1f4389d9d561fcabd1e42c234002b0a145508516eee40b30ba91e5774747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-simplejwt \
python3.11dist-djangorestframework-simplejwt \
python311-djangorestframework-simplejwt \
python3dist-djangorestframework-simplejwt"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-djangorestframework"

inherit rpm
