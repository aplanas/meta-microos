SUMMARY = "Development files for the Panel indicator applet (GTK+2 variant)"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator-devel-16.10.0+bzr20171205-4.15.aarch64.rpm"
RPM_HASH = "4190dbc99c25f29627359114f4daa3b3fe25b61bc79a5b8a0009e22c1f754cf995f06da2f959579467e50ebe1d9a0c52df2759008fad0353b12af4b71a31f15c"

RPROVIDES:${PN} += "libindicator-devel \
libindicator-devel(aarch-64) \
pkgconfig(indicator-0.4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libindicator7 \
pkgconfig(gtk+-2.0)"

inherit rpm
