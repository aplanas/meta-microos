SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python39-django-mptt-0.14-1.4.noarch.rpm"
RPM_HASH = "d5b9d5a0fbedd35fa9e512945496caf53dd6fe3f644b6e68228756af0cf17555b631c4cb218400a0a02a23a7fdc58a5597977712670cc924e1ed8061803248a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-mptt \
python39-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-js-asset"

inherit rpm
