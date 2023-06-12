SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "python310-django-registration-3.3-1.3.noarch.rpm"
RPM_HASH = "c135fdbdbfcf12a4cf9deaad4ad5648720f05c7e3da9c4747d6f4207d39255ee528c9c84f5cfbe756c9c47e69cf4e1e7529c7e4ff8c39eeeeea8dac71541b47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-registration \
python3.10dist(django-registration) \
python310-django-registration \
python3dist(django-registration)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-confusable-homoglyphs"

inherit rpm
