SUMMARY = "A generic tagging application for Django projects"
DESCRIPTION = "A generic tagging application for Django projects, \
which allows association of a number of tags \
with any Model instance and makes retrieval of tags simple."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-django-tagging-0.5.0-3.2.noarch.rpm"
RPM_HASH = "209b53af0b8f11582d87c6dec8b9088cf51177abd2e9cdd76fe1239d1332b5b3370d1a333a334b3d3487fa47f2f6477727ec1f6139f05fa503bc8c9390710a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-tagging) \
python311-django-tagging \
python3dist(django-tagging)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
