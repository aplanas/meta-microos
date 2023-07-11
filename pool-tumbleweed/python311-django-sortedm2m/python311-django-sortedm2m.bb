SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python311-django-sortedm2m-3.1.1-1.9.noarch.rpm"
RPM_HASH = "ccc885b565a105b3a54350e3a15b35541f6b283f6d290bb5a8e23a407331d055c8674ebb7f924641f696cc145dd74c213dc4eb2c63df793b27dff672720f6d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-sortedm2m \
python3.11dist-django-sortedm2m \
python311-django-sortedm2m \
python3dist-django-sortedm2m"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
