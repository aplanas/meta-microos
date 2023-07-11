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

PV = "1~20230615"

RPM_NAME = "piglit-1~20230615-1.1.aarch64.rpm"
RPM_HASH = "8ee53dad7a3af5cdc301f620a550c6a8188db6904e17c24b0bec215145a1a5d03dc9ead3498aa00bce18f8aab077f800572d302a645176b0b83bf9522a800fff"

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
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libwaffle-1.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
python3 \
python3-Mako \
python3-numpy \
python3-xml"

inherit rpm
