SUMMARY = "Shared library for xdg-utils-cxx"
DESCRIPTION = "Implementation of the FreeDesktop specifications to be used in c++ projects. \
Shared library for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXdgUtilsDesktopEntry1_0_1-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "1865a96964497754505f3939dcab4878b6725cb6dd0de064e95cbb7ec5ea718f0f7c420c6df3be17946045470f9670afaf5642e8fa8c7103269af0cef52a4d24"

RPROVIDES:${PN} += "libXdgUtilsDesktopEntry.so.1.0.1 \
libXdgUtilsDesktopEntry1-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
