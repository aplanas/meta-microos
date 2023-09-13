SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.7"

RPM_NAME = "python39-click-8.1.7-1.1.noarch.rpm"
RPM_HASH = "c357cc224e10218549dec6bd872083663146536b79f15c7b0365e43839e8ba509685fc3c35124c32f6a7c1423e5fec196fe4d1a22a2b9d974ae740528124d037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click \
python39-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
