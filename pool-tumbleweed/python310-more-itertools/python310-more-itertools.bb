SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python310-more-itertools-9.1.0-2.3.noarch.rpm"
RPM_HASH = "9a8af825fe66d140d6c2f1a7233e31e230e140af9fc0a7c15ff2d9e749cc7d6a34b40cab81db774ea498bece601308e53f119d795fe13910cb7e56bc5d2defc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-more-itertools \
python310-more-itertools \
python3dist-more-itertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
