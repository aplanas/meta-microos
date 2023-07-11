SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python310-djangorestframework-simplejwt-4.6.0-1.12.noarch.rpm"
RPM_HASH = "1999736be614366896d3cc92b24e23a7477743b3bbc17023373653d4d0497080d0b7042b5513e97136a6a983a875fec9a8e87c0dc44f154463f2329c78c06e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-djangorestframework-simplejwt \
python310-djangorestframework-simplejwt \
python3dist-djangorestframework-simplejwt"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-djangorestframework"

inherit rpm
