SUMMARY = "Octave clipping polygons tool"
DESCRIPTION = "This package allows to do boolean operations with polygons using \
the Greiner-Hormann algorithm. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "octave-forge-octclip-2.0.3-1.4.aarch64.rpm"
RPM_HASH = "66dfab100b7f65a6469132f886083ab350064c97f6b65ea3f0745ea3dcc3030658a3e5c46864c726ca1f16ff2c33c0d94d06635eaf3d73a5942d295be9711b33"

RPROVIDES:${PN} += "octave-forge-octclip"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
