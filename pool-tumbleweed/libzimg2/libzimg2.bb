SUMMARY = "Scaling, colorspace conversion, and dithering library"
DESCRIPTION = "The 'z' image library implements the commonly required image processing \
basics of scaling, colorspace conversion, and depth conversion."
LICENSE = "WTFPL"

PV = "3.0.5"

RPM_NAME = "libzimg2-3.0.5-1.1.aarch64.rpm"
RPM_HASH = "c5fc1e12cf88d802c11e0f47347ed534ed1ea021ecb6ee4ea79e909824b4d7770d44a7174a7a2dccb6a7a502dbb09fd79ac8b7d70b5303baa234fb8c2b6525df"

RPROVIDES:${PN} += "libzimg.so.2 \
libzimg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
