SUMMARY = "Command line tools for the MathGL library"
DESCRIPTION = "This package contains command line tools for making scientific graphics."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tools-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "a7c7990d0dc465c36f57866f951ea6f38ff5684a2b425c6ebe840854039cf7e2e6a02492eff1c17dfd254d7b4606b803094f1384e326f391760b3a02eaea67d5"

RPROVIDES:${PN} += "mathgl-tools \
mathgl-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libmgl-fltk.so.8()(64bit) \
libmgl.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
