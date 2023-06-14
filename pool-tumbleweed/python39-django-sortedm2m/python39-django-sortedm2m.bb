SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python39-django-sortedm2m-3.1.1-1.7.noarch.rpm"
RPM_HASH = "cf39988cf0655e2c8e1139a387bd90c4d804adcc6fd5fd052ba801480087e3011972df3a28ac58ec47af4f70c0fb82500f43366d80a7c7dd8491271350db4cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-sortedm2m \
python39-django-sortedm2m \
python3dist-django-sortedm2m"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
