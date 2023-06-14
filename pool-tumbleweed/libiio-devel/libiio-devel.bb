SUMMARY = "Industrial I/O library -- development files"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-devel-0.24-1.4.aarch64.rpm"
RPM_HASH = "1310442488d588948b9b17d25624209bdae3d329cc6180862975fb96f2de544194428b145786c3f4e1464f17f86e7dd89db5ec3afd5535e457c06dc8361b2807"

RPROVIDES:${PN} += "libiio-devel \
pkgconfig-libiio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiio0"

inherit rpm
