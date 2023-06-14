SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python311-django-mptt-0.14-1.4.noarch.rpm"
RPM_HASH = "e8a016680b94230a222a9328a0b641616517569a63c6411ac33b3defc5dfe13a8b26bd94b3348873719068db629a20826dfb509d01c2370558e416ca1cdc663d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-mptt \
python311-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-js-asset"

inherit rpm
