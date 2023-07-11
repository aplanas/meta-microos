SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-django-rest-knox-4.2.0-1.9.noarch.rpm"
RPM_HASH = "e7b1c4e5431b8a3e898e4c09d3ca0ef677942f4f93f5bb6fdce5a0f6ff6a86af9ac54511ef7e9bbadf54e9ea4a005ee7fa40b72e496cb4c3363c4f8a0d924f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-knox \
python3.11dist-django-rest-knox \
python311-django-rest-knox \
python3dist-django-rest-knox"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-cryptography \
python311-djangorestframework"

inherit rpm
