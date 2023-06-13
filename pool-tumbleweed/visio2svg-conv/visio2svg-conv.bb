SUMMARY = "VSS/VDS to SVG converter"
DESCRIPTION = "Tools to convert Visio Documents (VSD) or Stencils (VSS) to SVG."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "visio2svg-conv-0.5.5-3.13.aarch64.rpm"
RPM_HASH = "6d6afcdd662a3f0e75586de15b424f4124650815283de63e84e5bb11b9b6e1df001970442ebeced7d56c5b348467df5404f7f4399d68a8e0ad0cc46a0b4deb7e"

RPROVIDES:${PN} += "visio2svg-conv \
visio2svg-conv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libVisio2Svg.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvisio2svg0"

inherit rpm
