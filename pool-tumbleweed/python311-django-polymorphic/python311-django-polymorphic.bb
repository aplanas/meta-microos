SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python311-django-polymorphic-3.1-2.8.noarch.rpm"
RPM_HASH = "f017a94aba2483dd7e70a9ee99570cb11b1640a0ea1f3a88ecc06bc16f2b7333c3668aa3f7139f02e1c89400c5efeb903ba80d3d47a49c8a34386ca43a982f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-polymorphic \
python3.11dist-django-polymorphic \
python311-django-polymorphic \
python3dist-django-polymorphic"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
