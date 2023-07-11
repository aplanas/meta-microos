SUMMARY = "Fuzzy logic toolkit for Octave"
DESCRIPTION = "A mostly MATLAB-compatible fuzzy logic toolkit. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.6"

RPM_NAME = "octave-forge-fuzzy-logic-toolkit-0.4.6-1.10.noarch.rpm"
RPM_HASH = "a5443a43d1c73a93da71d7d6ad262ee8d81b85fb593d612e22dfae30d0961ddf294136a6dfeb5e8d68e53477fee972730d87249b6b396e38120540ed0d1db031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-fuzzy-logic-toolkit"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
