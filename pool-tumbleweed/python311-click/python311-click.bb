SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.6"

RPM_NAME = "python311-click-8.1.6-1.1.noarch.rpm"
RPM_HASH = "46744de6810d8cd6f9f5722aa44d6aca784383b9188345f42b64c4c3dc1237f815bbe7911cc5cc7089a41c36d35f6fa5ddf436b135b0cb1a605f2a95b9551d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click \
python3.11dist-click \
python311-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
