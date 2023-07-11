SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python311-django-treebeard-4.5.1-4.5.noarch.rpm"
RPM_HASH = "562d3d45560980117ef500acff532e6ed37ed96cf96efd284b6aa4beb47a718174f039ee50e650b5efb803ba4cccc6e2ffa63b26026be9c8d7e7e3689f77354a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-treebeard \
python3.11dist-django-treebeard \
python311-django-treebeard \
python3dist-django-treebeard"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
