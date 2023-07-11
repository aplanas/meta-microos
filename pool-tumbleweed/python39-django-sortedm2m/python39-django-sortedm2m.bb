SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python39-django-sortedm2m-3.1.1-1.9.noarch.rpm"
RPM_HASH = "e9046e9fa474391e36a3161bc9afd86ea6e4d74f1014ec0162671260e90fa16c677e60002790d1ed35403bc72ce1d1396e7d2ac6bca47dac9f89dc1f51fa17c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-sortedm2m \
python39-django-sortedm2m \
python3dist-django-sortedm2m"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
