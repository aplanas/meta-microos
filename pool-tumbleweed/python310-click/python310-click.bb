SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.6"

RPM_NAME = "python310-click-8.1.6-1.1.noarch.rpm"
RPM_HASH = "b0b8c891c0b2970d717031c6e75769d4ebaf591ebac94ff98eb73a38b7637078f6b67267a946a76728c3e3024b72e4727745b06f013f6ccb778bfe08737b37d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click \
python310-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
