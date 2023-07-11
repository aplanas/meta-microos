SUMMARY = "Octave mapping functions"
DESCRIPTION = "Simple Mapping and GIS .shp, .dxf and raster file functions. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "octave-forge-mapping-1.4.2-1.11.aarch64.rpm"
RPM_HASH = "05d160de9a0bbb84dc5b3ebc6c87ac6573d81c2326e4383e677367e8c2813012e55f3306269196f933a9e69268700bc11076dfe3979135f4f90a3df30338cca4"

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
