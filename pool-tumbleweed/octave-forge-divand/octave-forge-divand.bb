SUMMARY = "N-dimensional variational analysis for Octave"
DESCRIPTION = "divand performs an n-dimensional variational analysis (interpolation) \
of arbitrarily located observations. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "1.1.2"

RPM_NAME = "octave-forge-divand-1.1.2-1.23.noarch.rpm"
RPM_HASH = "f58dc12ee55bd96aa08b7d399d20d908022451c6c4bf5ae2d3e49ca9c6d62ef18a1f61591caf7166c5a0b47b4074845d8068d8e0b4ac31cc1686022974fe2f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-divand"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
