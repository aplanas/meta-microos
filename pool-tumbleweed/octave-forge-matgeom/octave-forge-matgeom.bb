SUMMARY = "Geometry toolbox for Octave"
DESCRIPTION = "Geometry toolbox for 2D/3D geometric computing. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause"

PV = "1.2.3"

RPM_NAME = "octave-forge-matgeom-1.2.3-1.3.noarch.rpm"
RPM_HASH = "fb3d78f0870fd77bb43f37c2eeacb3ddebd821f5fe8d61b2b193feb799b88de9607823667cc82094865f50c1071ec388fa748e1c9d30832bc0405281704d434f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-matgeom"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
