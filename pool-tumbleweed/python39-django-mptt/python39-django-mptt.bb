SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python39-django-mptt-0.14-1.6.noarch.rpm"
RPM_HASH = "048f3eb570a82863bc34b7478a1fde823d048621a303d9e68584a688692cd17bcf14cc48d513fa45894530d29c2c77d9ad33945726b885a3fa444ef9f04a41ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-mptt \
python39-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-js-asset"

inherit rpm
