SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python39-django-treebeard-4.5.1-4.3.noarch.rpm"
RPM_HASH = "dcf7e6951c2a5a8bccbe352d4c49fce58fca7ef9e2ad29721f10c19080142e7b35fb137d47f2121581268aba51df082489257767b8ae2f6eb1269021d50de1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-treebeard) \
python39-django-treebeard \
python3dist(django-treebeard)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
