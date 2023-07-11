SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python310-toolz-0.12.0-1.7.noarch.rpm"
RPM_HASH = "fc2ebba23fcdd37ca2024f383a9f63b9921de45aec5357771e2a9f2ecf86d28238eedd88a69eaf597a68a52dcbe3df3d6d1e58b96c96aee4726f4ff81bdc0deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-toolz \
python310-toolz \
python3dist-toolz"

RDEPENDS:${PN} += "python-abi"

inherit rpm
