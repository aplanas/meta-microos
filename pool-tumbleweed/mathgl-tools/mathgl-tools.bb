SUMMARY = "Command line tools for the MathGL library"
DESCRIPTION = "This package contains command line tools for making scientific graphics."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tools-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "a7c7990d0dc465c36f57866f951ea6f38ff5684a2b425c6ebe840854039cf7e2e6a02492eff1c17dfd254d7b4606b803094f1384e326f391760b3a02eaea67d5"

RPROVIDES:${PN} += "mathgl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl-fltk.so.8 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
