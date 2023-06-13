SUMMARY = "Geometry toolbox for Octave"
DESCRIPTION = "Geometry toolbox for 2D/3D geometric computing. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause"

PV = "1.2.3"

RPM_NAME = "octave-forge-matgeom-1.2.3-1.2.noarch.rpm"
RPM_HASH = "e943b4275a2032a3543159225e324769be2868f39ed1bdb0d40cc4f06ca581de305bedfeae411d027062b9a1426fe2ad5fd9b3958b5b96c3500eb8ba23befa46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-matgeom"

RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
