SUMMARY = "Scaling, colorspace conversion, and dithering library"
DESCRIPTION = "The 'z' image library implements the commonly required image processing \
basics of scaling, colorspace conversion, and depth conversion."
LICENSE = "WTFPL"

PV = "3.0.4"

RPM_NAME = "libzimg2-3.0.4-1.5.aarch64.rpm"
RPM_HASH = "c1946e7b3b314a73a30bd636994452fb7b80ad916b4abc27b65ae438ac3ae00125b5c5fdab663aa8132b209167956897b65268a85b8df275a3d198fe78ff12d3"

RPROVIDES:${PN} += "libzimg.so.2 \
libzimg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
