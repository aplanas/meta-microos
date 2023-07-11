SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3"

RPM_NAME = "python310-click-8.1.3-4.3.noarch.rpm"
RPM_HASH = "02165306d44e95543c4701f46d48aa6aea0e8a30889733541912b67d158d0fc767ee0a528df2d23dde4c6467ead8f02a75141e9a31eaad0de525eae1ad081973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click \
python310-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
