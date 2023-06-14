SUMMARY = "OpenGL driver testing framework"
DESCRIPTION = "Piglit is a collection of automated tests for OpenGL and OpenCL \
implementations. \
 \
The goal of Piglit is to help improve the quality of open source \
OpenGL drivers by providing developers with means to perform \
regression tests. \
 \
It contains the Glean tests, some tests adapted from Mesa, as well as \
some specific regression tests for certain bugs. HTML summaries can \
be generated, including the ability to compare different test runs."
LICENSE = "MIT"

PV = "1~20210326.6a4be9e99"

RPM_NAME = "piglit-1~20210326.6a4be9e99-3.3.aarch64.rpm"
RPM_HASH = "31d2f95ff4729a735fa57ce536c9ef87111d81f25cb60cd2d6bf44ba57003746d89184ca42f0fcd44fa4a6a3186859c8d3b6fd56f555ab08e351ba41af6a9668"

RPROVIDES:${PN} += "libpiglitutil-gles1.so.0 \
libpiglitutil-gles2.so.0 \
libpiglitutil-gles3.so.0 \
libpiglitutil.so.0 \
piglit"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm-intel.so.1 \
libdrm.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libwaffle-1.so.0 \
libxcb-dri2.so.0 \
libxcb.so.1 \
python3 \
python3-Mako \
python3-numpy \
python3-xml"

inherit rpm
