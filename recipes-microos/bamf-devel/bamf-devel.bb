SUMMARY = "Development files for the BAMF window matching library"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains files that are needed to build applications."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-devel-0.5.6-1.4.aarch64.rpm"
RPM_HASH = "01a72e234292f90796743a0574aeab446382c89bc81d894b4e6ee648e800b41b2d836af438af247a0cc1dc8ba0ac3bd78771e9a97bd09f05374b10d869bea8c8"

RPROVIDES:${PN} += "bamf-devel \
bamf-devel(aarch-64) \
pkgconfig(libbamf3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbamf3-2 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
typelib-1_0-Bamf-3_0"

inherit rpm
