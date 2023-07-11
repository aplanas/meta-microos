SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "3.0.6"

RPM_NAME = "python311-django-grappelli-3.0.6-1.3.noarch.rpm"
RPM_HASH = "ce66317a63ba5a7ebabe587df43a532db463d4216f8931ad158c62675fb63bb9000b8a3fc01c5bb47209d5571f26ffba2c2598c93878788affabb09c56816050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-grappelli \
python3.11dist-django-grappelli \
python311-django-grappelli \
python3dist-django-grappelli"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
