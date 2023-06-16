SUMMARY = "Octave mapping functions"
DESCRIPTION = "Simple Mapping and GIS .shp, .dxf and raster file functions. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "octave-forge-mapping-1.4.2-1.10.aarch64.rpm"
RPM_HASH = "9db4008dfb13454673ccc6e399969291dfdc37cc27b235f55fabea5dfc1f2ed4bdc25b95e6abb21a4d3ddfa10188ee0cacc80e755c8dbf11f153fbd23fb21527"

RPROVIDES:${PN} += "octave-forge-mapping"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
octave-cli \
octave-forge-geometry \
octave-forge-io"

inherit rpm
