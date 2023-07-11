SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python311-toolz-0.12.0-1.7.noarch.rpm"
RPM_HASH = "1b977c22a54f4453dbcb4f28d726c884a8c80bc12ecb9c6d8ff64ac3182fa791d8591956523a6feb88d547fad11bc9dc0f89805ee418fe91c51d90ffcfa63084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toolz \
python3.11dist-toolz \
python311-toolz \
python3dist-toolz"

RDEPENDS:${PN} += "python-abi"

inherit rpm
