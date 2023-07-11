SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3"

RPM_NAME = "python39-click-8.1.3-4.3.noarch.rpm"
RPM_HASH = "efd6971bfac6d40ff77d09cb10e43975ad5bee60e5bf3672266103d8bb9f20cbb409637f1018763e1f5863b56edb90ac36cf4e0453a45cad3310b2c74f29bc2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click \
python39-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
