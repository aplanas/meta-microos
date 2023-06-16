SUMMARY = "Linear algebra package for Octave"
DESCRIPTION = "Additional linear algebra code, including general SVD and matrix functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & BSD-2-Clause"

PV = "2.2.3"

RPM_NAME = "octave-forge-linear-algebra-2.2.3-1.13.noarch.rpm"
RPM_HASH = "201db73df333a53cde20859e18315f51643416596a2d38a08fc33976ddee5b3fb59d28ed026f92447600c4595747643fc19ae04dc4014964be663a848d10bfbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-linear-algebra"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
