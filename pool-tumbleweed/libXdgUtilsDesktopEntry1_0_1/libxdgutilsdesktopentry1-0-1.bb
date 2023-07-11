SUMMARY = "Shared library for xdg-utils-cxx"
DESCRIPTION = "Implementation of the FreeDesktop specifications to be used in c++ projects. \
Shared library for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXdgUtilsDesktopEntry1_0_1-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "f87b0054996f679f5f07c7ffbba546d716368f40518d2cc007da076fa732c9b32c3d06f5b897d5a45400b3040893a81e0a80c35715143780a0c90242b27a5dfb"

RPROVIDES:${PN} += "libXdgUtilsDesktopEntry.so.1.0.1 \
libXdgUtilsDesktopEntry1-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
