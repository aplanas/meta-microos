SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "1.7.5+wayland2+git.1690115482.ff2338c"

RPM_NAME = "rofi-wayland-devel-1.7.5+wayland2+git.1690115482.ff2338c-1.1.aarch64.rpm"
RPM_HASH = "f7a9677b0a1ca54633c8b2cdc9e581f0ecba4a4a273374b6356cc9ed93e460eb7a62e6d111ed3e336376542eacb9aa8cfaa518cd4675d9de3efdc898cda0645f"

RPROVIDES:${PN} += "pkgconfig-rofi \
rofi-wayland-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0"

inherit rpm
