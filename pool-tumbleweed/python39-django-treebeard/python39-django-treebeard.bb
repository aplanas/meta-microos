SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python39-django-treebeard-4.5.1-4.5.noarch.rpm"
RPM_HASH = "22db8d44013671f2167164c9d84c10fd3fd5a508df4dd9b0bc61350c3f1a0d493b8dab41d0c111151356a81236fbc7bdb3b546197ce1cafe47604bd159c12525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-treebeard \
python39-django-treebeard \
python3dist-django-treebeard"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
