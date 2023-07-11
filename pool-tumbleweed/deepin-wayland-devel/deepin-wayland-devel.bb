SUMMARY = "Development package for deepin-wayland"
DESCRIPTION = "Header files and libraries for deepin-wayland."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "deepin-wayland-devel-1.0.0-1.12.aarch64.rpm"
RPM_HASH = "6614f235159317482bb3d855d682170d25845cb28cf312fd71bf41aaab178921bb1c1de06ea3fd8995a242dd553b0dfe4278db10b4a18c7a950bd7bc53cfaafc"

RPROVIDES:${PN} += "deepin-wayland-devel \
pkgconfig-dde-wayland-client \
pkgconfig-dde-wayland-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdde-wayland-client0 \
libdde-wayland-server0"

inherit rpm
