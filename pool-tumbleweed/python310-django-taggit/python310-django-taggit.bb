SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.0.0"

RPM_NAME = "python310-django-taggit-4.0.0-1.1.noarch.rpm"
RPM_HASH = "18e8dbc5c44aa4908cbc82e70981601abc6337da593837fc2413adaee9a16fbd434a3be7fc98ebb422a811b85e5ea0fe6bb8ea42a345bc31c5530e2650c6d605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-taggit \
python3.10dist(django-taggit) \
python310-django-taggit \
python3dist(django-taggit)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
