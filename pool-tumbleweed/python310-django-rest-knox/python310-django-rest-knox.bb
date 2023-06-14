SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-django-rest-knox-4.2.0-1.7.noarch.rpm"
RPM_HASH = "7c9af695fa4907e1a5a465a46301910a6719dae459ba5202c6d24be1f10999d3aad8220ac3ba81ecb83fc544171457966fa3c8add09db92e5cc24dd80ec2b4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-knox \
python3.10dist-django-rest-knox \
python310-django-rest-knox \
python3dist-django-rest-knox"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-cryptography \
python310-djangorestframework"

inherit rpm
