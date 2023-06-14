SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python39-djangorestframework-simplejwt-4.6.0-1.10.noarch.rpm"
RPM_HASH = "ca3bd98047eb14f1735b2aed7ac5c0daa484266dfd432aeac586a9093919cfd4ae1bd8c75fe2163043ea8ebbcb2ed4a192794bd096a2be783a3934ea2590d1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-djangorestframework-simplejwt \
python39-djangorestframework-simplejwt \
python3dist-djangorestframework-simplejwt"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-djangorestframework"

inherit rpm
