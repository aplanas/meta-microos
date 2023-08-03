SUMMARY = "Development files for libelf"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libelf."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf-devel-0.189-4.1.aarch64.rpm"
RPM_HASH = "7fbbce23a5d5956fb1aa38523441fdfbb9657505ff3fc632785406cdc4fe5fe61cb616fb81ec28b0f778c72ada129c9c3a69151e0ec6a77bdd16c60fc633608c"

RPROVIDES:${PN} += "libelf-devel \
pkgconfig-libelf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libelf1 \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
