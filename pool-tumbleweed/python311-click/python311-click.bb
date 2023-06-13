SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3"

RPM_NAME = "python311-click-8.1.3-4.1.noarch.rpm"
RPM_HASH = "0ff22e9e6d933063584bbf74a48ab0258b36206f816e1f21323ea6441eab3c71bfa06af89e7b7b40127922d3a06ae12e4c98447e78cdd8e8d966e71e52b38609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click) \
python311-click \
python3dist(click)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
