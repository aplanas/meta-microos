SUMMARY = "Simple Terminal Implementation for X"
DESCRIPTION = "Simple and lightweight and unbloated X11 terminal."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "st-0.9-2.1.aarch64.rpm"
RPM_HASH = "87e4fabbc12387b607feaba93c6b8d335ae8be5f8576ad0015219516dfbbe2989f3c9e27dd4785445effb81615ebe71808af2a6c1fa9b0d676d745e714159708"

RPROVIDES:${PN} += "st"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libfontconfig.so.1 \
terminfo"

inherit rpm
