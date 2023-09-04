SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.6"

RPM_NAME = "python39-click-8.1.6-1.1.noarch.rpm"
RPM_HASH = "f1af30607b1e9c86f7a5e1469ff59583dc7b3dd0a13c1a5f75c34079a7cef5a9cfa89ca36b813a583e202b9ae76fe204aa7581704ff3be54b701bf4cb9de66ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click \
python39-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
