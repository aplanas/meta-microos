SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python39-more-itertools-9.1.0-2.3.noarch.rpm"
RPM_HASH = "b86b0eca3900311dbba124f4241265f0138e05676bd120c34959c27420b0171fcfabaf42471dfd5b8147ca04d8bb7d90a96fd24fe0c1c10766c6bcc02b1d4cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-more-itertools \
python39-more-itertools \
python3dist-more-itertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
