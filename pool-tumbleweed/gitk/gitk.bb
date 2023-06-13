SUMMARY = "Git revision tree visualiser"
DESCRIPTION = "Grapical tool for visualization of revision trees of projects \
maintained in the Git version control system. It name gitk indicates \
that it's written using the Tk Widget set. \
 \
A simple Tk based graphical interface for common Git operations is \
found in the package git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "gitk-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "182cc826a69ee1321f9ac64c66dd090abb48f06016187fc1b0e4dbebdb047d3d075d8d909f74974096adfbe3a8c4c4ece500969c367df0dda03937621d525e26"

RPROVIDES:${PN} += "gitk \
gitk(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
git-core \
tk"

inherit rpm
