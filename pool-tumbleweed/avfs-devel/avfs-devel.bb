SUMMARY = "Development files for AVFS, an archive look-inside filesystem"
DESCRIPTION = "This package includes the development file for the package avfs. \
AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "avfs-devel-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "82ac7309270dd16effafc1ecdc0cfb4bc605152a9f2772ee32406b0cb40f5c42381fa7cebee1c6d79932332bad3ce5ee7d698cce2d0cfe5e356250da8178cdf7"

RPROVIDES:${PN} += "avfs-devel \
avfs-devel(aarch-64) \
pkgconfig(avfs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libavfs0"

inherit rpm
