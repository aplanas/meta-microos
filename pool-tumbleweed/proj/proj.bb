SUMMARY = "Cartographic projection software"
DESCRIPTION = "This package offers the commandline tools for performing respective \
forward and inverse transformation of cartographic data to or from cartesian \
data with a wide range of selectable projection functions."
LICENSE = "MIT"

PV = "9.2.1"

RPM_NAME = "proj-9.2.1-1.1.aarch64.rpm"
RPM_HASH = "08a34cb9980b63d0308c12a6fa9a7c4fa0816fc726cb05f75ea970ccabda8f3e80bf235fab357ff104abfebd6cfad09f47564329e9977353a6c47539ae68634e"

RPROVIDES:${PN} += "libproj \
proj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libproj.so.25 \
libstdc++.so.6"

inherit rpm
