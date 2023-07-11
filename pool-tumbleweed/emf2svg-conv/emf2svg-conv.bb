SUMMARY = "EMF to SVG converter"
DESCRIPTION = "Tool to convert files in EMF format to SVG"
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "emf2svg-conv-1.1.0-2.14.aarch64.rpm"
RPM_HASH = "526808fcfe948eba3d91a59f8142aa5af2c247d81a21beaf48080e3a148f8e01ba729f1521b79d5dfba7c6a08b7e1ff9456f17a627cbd9a5d96f60aa8bfbce97"

RPROVIDES:${PN} += "emf2svg-conv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libemf2svg.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
