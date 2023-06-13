SUMMARY = "SEmi Conductor Simulator in 3D for Octave"
DESCRIPTION = "A Drift-Diffusion simulator for 3D semiconductor devices. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "0.0.1"

RPM_NAME = "octave-forge-secs3d-0.0.1-1.20.noarch.rpm"
RPM_HASH = "a392eb34d9c84c1a0409df4a31b97018665ae0c760f318102a522e4f97ddfa3654fcb2ffd312da0be4babfe3034dcb6c1afb163c0a717509f485807223c06412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-secs3d"

RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-bim \
octave-forge-fpl"

inherit rpm
