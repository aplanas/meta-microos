SUMMARY = "SEmi Conductor Simulator in 3D for Octave"
DESCRIPTION = "A Drift-Diffusion simulator for 3D semiconductor devices. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "0.0.1"

RPM_NAME = "octave-forge-secs3d-0.0.1-1.21.noarch.rpm"
RPM_HASH = "aacce08bfa1e973a6bc40a492631b8bc037f216bb409c77a58ec6f09073cb8b4548bc9abd4078989112caf77b5fe67a7821dc7f480710081bf7ced6a06f81b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-secs3d"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-bim \
octave-forge-fpl"

inherit rpm
