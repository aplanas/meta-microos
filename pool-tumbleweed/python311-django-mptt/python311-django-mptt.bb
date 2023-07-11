SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python311-django-mptt-0.14-1.6.noarch.rpm"
RPM_HASH = "e3ace7a1da6d8ce03e2a436fb680e428e1017969f7148c0a6d1304d45c51f89291a8f2e4b63e19d9eae6b5fc21522d5bb3e6df271ffe55f81051f76ab2df7b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mptt \
python3.11dist-django-mptt \
python311-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-js-asset"

inherit rpm
