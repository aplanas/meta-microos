SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.7"

RPM_NAME = "python310-click-8.1.7-1.1.noarch.rpm"
RPM_HASH = "cf489715757de775170659d8732db7394e006f635339d76d5e68312f38250abe0273944afbd7ca14da1ec0b80b1c5c84465fab18bead68ff053f329ea1071e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click \
python310-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
