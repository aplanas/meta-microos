SUMMARY = "SEmi Conductor Simulator in 1D for Octave"
DESCRIPTION = "A Drift-Diffusion simulator for 1d semiconductor devices. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0+ & GPL-3.0+"

PV = "0.0.9"

RPM_NAME = "octave-forge-secs1d-0.0.9-1.21.noarch.rpm"
RPM_HASH = "9e9802f84f5912e8a58fccdc7a7a8870511a82271dbb76483b7972cc74073035d56a2d384fa6f6dabbe61620a4a0c176627c3aaf6dd462129d6e6e05da3bc063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-secs1d"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-bim"

inherit rpm
