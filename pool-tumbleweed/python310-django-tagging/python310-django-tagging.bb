SUMMARY = "A generic tagging application for Django projects"
DESCRIPTION = "A generic tagging application for Django projects, \
which allows association of a number of tags \
with any Model instance and makes retrieval of tags simple."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-django-tagging-0.5.0-3.2.noarch.rpm"
RPM_HASH = "9c5a0a0a23ec3394e370c17dbcf67b924fa7119870eb17ffda168f0e4a7e10d6c10608914791530c75b77a2707adb31238b3e9e3b0443ac3c0e49521a41eafbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tagging \
python3.10dist(django-tagging) \
python310-django-tagging \
python3dist(django-tagging)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
