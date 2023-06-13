SUMMARY = "Tools to transform QuarkXPress documents into other formats"
DESCRIPTION = "Tools to transform QuarkXPress documents into other formats. \
Currently supported: SVG, plain text, raw."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-tools-0.0.2-1.20.aarch64.rpm"
RPM_HASH = "87c7ac4f6629ed4b5d3b11c691a231932c3e70da44d0f6ae8d100a352610c40217fda2f9b85e234f39bc1e0466c65299e2a61f84178a308f5fe7474bf2213df7"

RPROVIDES:${PN} += "libqxp-tools \
libqxp-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libqxp-0.0.so.0()(64bit) \
libqxp-0_0-0 \
librevenge-0.0.so.0()(64bit) \
librevenge-generators-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
