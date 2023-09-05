SUMMARY = "Git revision tree visualiser"
DESCRIPTION = "Grapical tool for visualization of revision trees of projects \
maintained in the Git version control system. It name gitk indicates \
that it's written using the Tk Widget set. \
 \
A simple Tk based graphical interface for common Git operations is \
found in the package git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "gitk-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "340367169c2fc0984c526b73aa5ccc5c4d1e1e71ca370ebd166cbde45eea9296ba3ebde0003a0c4ed5e6c98dd87bb48267ab2d01ef6b09cca4ddd33790315565"

RPROVIDES:${PN} += "gitk"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm
