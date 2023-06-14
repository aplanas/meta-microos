SUMMARY = "Computer vision Library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "libvigraimpex11-1.11.1-4.5.aarch64.rpm"
RPM_HASH = "70602c3543b6f85999b0039caabe02013f134a00aca42a73af5290e6d56572ab487bb883e1cfcf2cd3528046dccc5c8edd2eda693d691513d75407a76b31eb43"

RPROVIDES:${PN} += "libvigraimpex.so.11 \
libvigraimpex11 \
vigra"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
