SUMMARY = "Development Environment for libdvdnav"
DESCRIPTION = "This library contains functions to display DVD video menus."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "libdvdnav-devel-6.1.1-1.9.aarch64.rpm"
RPM_HASH = "332118c26f36eb7bdaa759e128aeecd5b59c6acabeaf30ac67f9a952fc51cd3f6dad1e16b76636c1f55066e94e2d3b823011a54db5fb9b2a9335a35348d76e1c"

RPROVIDES:${PN} += "libdvdnav-devel \
libdvdnav-devel(aarch-64) \
pkgconfig(dvdnav)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvdnav4 \
pkgconfig(dvdread)"

inherit rpm
