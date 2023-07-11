SUMMARY = "Faster OpenGL offloading for Bumblebee"
DESCRIPTION = "Primus is a shared library that provides OpenGL and GLX APIs and \
implements low-overhead local-only client-side OpenGL offloading via GLX \
forking, similar to VirtualGL. It intercepts GLX calls and redirects GL \
rendering to a secondary X display, presumably driven by a faster GPU. \
On swapping buffers, rendered contents are read back using a PBO and \
copied onto the drawable it was supposed to be rendered on in the first \
place."
LICENSE = "HPND"

PV = "0+git20150328.d1afbf6"

RPM_NAME = "primus-0+git20150328.d1afbf6-3.22.aarch64.rpm"
RPM_HASH = "caceb52dc889c30c4b2270fb9563e2075ec1f107a8a455bccab40139d14f23abe94380138cdfb3cd84256851bdf6dcfe6008ab667a95fd9084bd8e38e7fb5197"

RPROVIDES:${PN} += "libGL.so.1 \
primus"

RDEPENDS:${PN} += "/usr/bin/bash \
bumblebee \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
