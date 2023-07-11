SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-django-rest-knox-4.2.0-1.9.noarch.rpm"
RPM_HASH = "3d692e6034f652adc7fae59ba1b4f73a9957ae888e246cb779403b47bb91710fa3cb445378f75630d13eaae752a3a24179b44acc90d86b9c5143f020ec289a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rest-knox \
python310-django-rest-knox \
python3dist-django-rest-knox"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-cryptography \
python310-djangorestframework"

inherit rpm
