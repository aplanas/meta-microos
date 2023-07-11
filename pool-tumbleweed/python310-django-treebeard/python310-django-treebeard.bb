SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python310-django-treebeard-4.5.1-4.5.noarch.rpm"
RPM_HASH = "63d4f4d7c03caf50ce84af73581f14c49be6eeb78d3337bdde89a58d9cec0e45f6fa7937b3a706e40a0550198b815ea069ef5017fc19c0194092af18254ae38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-treebeard \
python310-django-treebeard \
python3dist-django-treebeard"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
