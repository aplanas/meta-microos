SUMMARY = "Scaling, colorspace conversion, and dithering library"
DESCRIPTION = "The 'z' image library implements the commonly required image processing \
basics of scaling, colorspace conversion, and depth conversion."
LICENSE = "WTFPL"

PV = "3.0.4"

RPM_NAME = "libzimg2-3.0.4-1.6.aarch64.rpm"
RPM_HASH = "61a79fa65286c71390bf2962c32539607a89c5e7f1fd74f9f280007de563a09bf801990fc1677f9936d87a0d0a9b8347bb1f2d9d24300190f69b335d494e1315"

RPROVIDES:${PN} += "libzimg.so.2 \
libzimg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
