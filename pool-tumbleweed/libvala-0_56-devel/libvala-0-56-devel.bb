SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Development files for the Vala runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "libvala-0_56-devel-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "1f1bb2f12c8ce78b385787bd410508ca9b8af369c588c5a906f28e1c907991c0acc7a8209e0f72227c196b00129e234bdeacfb2fbb41a50977f2e9663ec20377"

RPROVIDES:${PN} += "libvala-0-56-devel \
libvala-devel \
pkgconfig-libvala-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvala-0-56-0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
