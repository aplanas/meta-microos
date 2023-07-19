SUMMARY = "A follow the mouse X demo"
DESCRIPTION = "Xeyes watches what you do and reports to the Boss."
LICENSE = "X11"

PV = "1.3.0"

RPM_NAME = "xeyes-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "251e39925df2a5d28dd66b3c49a02ce6dd9a06e915244feaefecae125774dae7f74da8ff0a2aa226e4323e392d0bc31ac318bc8c1c7cdf7953dd98247c935774"

RPROVIDES:${PN} += "xeyes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxcb-damage.so.0 \
libxcb-present.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
