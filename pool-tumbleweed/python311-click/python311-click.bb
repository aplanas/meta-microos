SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.7"

RPM_NAME = "python311-click-8.1.7-1.1.noarch.rpm"
RPM_HASH = "49f54eb137768554d0419d49e870f8832d9dccf52479045e32287c4ea62f0a7c5acf4213469607042f0714f69942b4400512883901473ff4ab324d1bfb194468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click \
python3.11dist-click \
python311-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
