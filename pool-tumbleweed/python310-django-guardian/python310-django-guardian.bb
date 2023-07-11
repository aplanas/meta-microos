SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python310-django-guardian-2.4.0-4.1.noarch.rpm"
RPM_HASH = "da9822b09c278cd0944e11e4bc3a1c30adcb7692865b6892c0acede181bfb2d1a58bfbddedbcc23c8b15b2ef7c6814ee0110f07f73edd4ead0e8b9b5bdfc8cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-guardian \
python310-django-guardian \
python3dist-django-guardian"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
