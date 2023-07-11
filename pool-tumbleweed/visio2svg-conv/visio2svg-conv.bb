SUMMARY = "VSS/VDS to SVG converter"
DESCRIPTION = "Tools to convert Visio Documents (VSD) or Stencils (VSS) to SVG."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "visio2svg-conv-0.5.5-3.14.aarch64.rpm"
RPM_HASH = "6fb012bae99625ee143c44422c609378f128fb0c7d2915b326ef7e4629f6f0c8d90add75bddf218715869ff26f702ae0bcbd2d19296ad199a00a65e694175f1b"

RPROVIDES:${PN} += "visio2svg-conv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libVisio2Svg.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvisio2svg0"

inherit rpm
