SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "1.7.5+wayland1+git.1679493688.d06095b"

RPM_NAME = "rofi-wayland-devel-1.7.5+wayland1+git.1679493688.d06095b-1.1.aarch64.rpm"
RPM_HASH = "72d33e883e5fda0b350c18a1b91b4f1cfca6f1ab128f16ac6738556f1577b9be090ea4e58341c71552fe3b6515b9b7fbd678c507e98351010fa176d6ada498cb"

RPROVIDES:${PN} += "pkgconfig(rofi) \
rofi-wayland-devel \
rofi-wayland-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(cairo) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0)"

inherit rpm
