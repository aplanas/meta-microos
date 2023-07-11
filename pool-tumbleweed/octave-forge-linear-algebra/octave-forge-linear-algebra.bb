SUMMARY = "Linear algebra package for Octave"
DESCRIPTION = "Additional linear algebra code, including general SVD and matrix functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & BSD-2-Clause"

PV = "2.2.3"

RPM_NAME = "octave-forge-linear-algebra-2.2.3-1.14.noarch.rpm"
RPM_HASH = "a556545512a2f0dd6fbc7089b2872475dcc617a71bf668aab01f2ceb8ac5c222310425eb198ba371b45d2f46aa3e3c2ab889c4ab49285dc4016cd5e2609477cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-linear-algebra"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
