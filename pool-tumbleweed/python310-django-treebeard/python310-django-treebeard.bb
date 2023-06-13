SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python310-django-treebeard-4.5.1-4.3.noarch.rpm"
RPM_HASH = "1c8130455c850c0f1b25b97cd44fb34c8a6fa4d71e3c920eb5c705d8bd3fd3be13c627b34f1e7d9d9646c41da96d8dc930e1166790d0c6551d946d1e3f445b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-treebeard \
python3.10dist(django-treebeard) \
python310-django-treebeard \
python3dist(django-treebeard)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
