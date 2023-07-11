SUMMARY = "Development files for AVFS, an archive look-inside filesystem"
DESCRIPTION = "This package includes the development file for the package avfs. \
AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "avfs-devel-1.1.5-1.3.aarch64.rpm"
RPM_HASH = "094eda44797e3c29cd6b0a88edd4bcb4c1cd01a8990d50e1f689c2a1e80a1afae683b1341306a10334d20da8423988232234b5007a5d4632b13df2e9de65d714"

RPROVIDES:${PN} += "avfs-devel \
pkgconfig-avfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libavfs0"

inherit rpm
