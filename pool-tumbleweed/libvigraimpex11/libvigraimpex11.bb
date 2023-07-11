SUMMARY = "Computer vision Library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "libvigraimpex11-1.11.1-4.6.aarch64.rpm"
RPM_HASH = "ada9c2bf981519ea2af59bf7aed220c38ba0ddcd39877c5c55d4d9a2895591a1df5a5efb5d410879d9e5bfc9c8c6ffc0896e75ff7e1e41490a39d5253d9a0f42"

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
