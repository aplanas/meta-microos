SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3"

RPM_NAME = "python39-click-8.1.3-4.1.noarch.rpm"
RPM_HASH = "c21e4683b60bf7781c4340438f1b18277726f6a78996e3a0bcb5d74228456980f82780e8fe097f64905a5a6b758bc15fb7262e1b19d6a486eea4b38e1b13e0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click) \
python39-click \
python3dist(click)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
