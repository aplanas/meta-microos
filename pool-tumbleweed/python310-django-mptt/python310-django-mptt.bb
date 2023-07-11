SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python310-django-mptt-0.14-1.6.noarch.rpm"
RPM_HASH = "643e2f37aba0e74906c64163875d56d81d0c8fcd2a7f51ddee3a2f11ce2e4b6eb674a3ad9f7d233a40fba875c37b355a39f7ed71d541038fb8ccaa2110c26fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-mptt \
python310-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-js-asset"

inherit rpm
