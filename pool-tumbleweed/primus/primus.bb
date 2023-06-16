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

RPM_NAME = "primus-0+git20150328.d1afbf6-3.21.aarch64.rpm"
RPM_HASH = "991079b89a4d46ad5c5228d00b2c93506fc9130f4ab33f05729fa5d7f5f65e1328e6df513e5e8effb5c610b7df15bf2f5135b5a410ec3ef5a58b0e77c31b6c11"

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
