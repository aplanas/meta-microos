SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python311-django-treebeard-4.5.1-4.3.noarch.rpm"
RPM_HASH = "2da73579aabb5ef2b480349e039a071703120222e281e929dd349b0a26694adb29f23beb02f1e2c3401c038ff71d3e6e819c7b088ff99ac76c489351ffeba098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-treebeard) \
python311-django-treebeard \
python3dist(django-treebeard)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
