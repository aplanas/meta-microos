SUMMARY = "Xspice code model Plugins"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the Xspice code model plugins."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "ngspice-xspice-cm-40-1.2.aarch64.rpm"
RPM_HASH = "28b09ce5c9668a98ca6b392675b16b36178ad21e8c933a833fc3c056c329f6784e08bdec710e82b07292cee58317b3ff47a43bf746d6a27ad1d21d84f51c770d"

RPROVIDES:${PN} += "ngspice-xspice-cm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
