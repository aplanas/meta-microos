SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3"

RPM_NAME = "python311-click-8.1.3-4.3.noarch.rpm"
RPM_HASH = "d8c71d9287463bc91f2aebde4a4405e50d91084345a0683224cb9dd18b764b110a021e9c51312f499b823a5c921e6599f86b0920cd071ea7deb6c0733950961e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click \
python3.11dist-click \
python311-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
