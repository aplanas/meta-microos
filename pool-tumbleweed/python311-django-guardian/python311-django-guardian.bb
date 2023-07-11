SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python311-django-guardian-2.4.0-4.1.noarch.rpm"
RPM_HASH = "d9fb8011632bcc7e60aa3e02bca0b129e8c2cffcad413ab2c5c469a54ae25818540ca97647c07c529a0babeff8a7a29ba5f7f442ed810ec20fcbb91faeb7b9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-guardian \
python3.11dist-django-guardian \
python311-django-guardian \
python3dist-django-guardian"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
