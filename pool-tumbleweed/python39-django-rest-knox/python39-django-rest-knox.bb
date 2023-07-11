SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-django-rest-knox-4.2.0-1.9.noarch.rpm"
RPM_HASH = "f37aaaccc08846c841fbe61722e32627a3727ca9f17db8fb56985715179b6b2280bf832899f46ee0aa957d6b8db360ccfabd87a0de3553185e1f29c67fc481fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rest-knox \
python39-django-rest-knox \
python3dist-django-rest-knox"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-cryptography \
python39-djangorestframework"

inherit rpm
