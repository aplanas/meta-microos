SUMMARY = "Shared library for xdg-utils-cxx"
DESCRIPTION = "Implementation of the FreeDesktop specifications to be used in c++ projects. \
Shared library for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXdgUtilsBaseDir1_0_1-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "9c62a15af3417842ebe0a24d65f1ef827747d898d956cad26b5287a4ee2e5afa538599d86660adf3d77dfbea2daa89180c7d1cd296ee1043130e23d9312c22b9"

RPROVIDES:${PN} += "libXdgUtilsBaseDir.so.1.0.1 \
libXdgUtilsBaseDir1-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
