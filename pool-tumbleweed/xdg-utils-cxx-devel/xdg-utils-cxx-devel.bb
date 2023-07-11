SUMMARY = "Development files for xdg-utils-cxx"
DESCRIPTION = "Development files for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xdg-utils-cxx-devel-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "e4fa45d25aa9071dd219b07ec34752b82f9d3d488cfe97b16affdc33a27dc6bcd3972d2fed8b259bdaf297b2ad5910a8402d8c8fd87eb63a98747384f3503ee3"

RPROVIDES:${PN} += "cmake-XdgUtils \
xdg-utils-cxx-devel"

RDEPENDS:${PN} += "libXdgUtilsBaseDir1-0-1 \
libXdgUtilsDesktopEntry1-0-1"

inherit rpm
