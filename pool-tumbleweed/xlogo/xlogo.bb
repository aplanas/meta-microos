SUMMARY = "X Window System logo"
DESCRIPTION = "The xlogo program simply displays the X Window System logo."
LICENSE = "X11"

PV = "1.0.6"

RPM_NAME = "xlogo-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "fde1649e519c3bac39b04d0bc668fe2d2709b0169f32b8054353fe998a2d75e696e798df9f978b1628e9810f5b6fe820e1f325ffe6e04add8ded7e89274c4989"

RPROVIDES:${PN} += "xlogo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSM.so.6 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
