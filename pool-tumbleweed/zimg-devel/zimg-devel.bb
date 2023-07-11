SUMMARY = "Development files for libzimg2"
DESCRIPTION = "The libzimg-devel package contains libraries and header files for \
developing applications that use libzimg2."
LICENSE = "WTFPL"

PV = "3.0.4"

RPM_NAME = "zimg-devel-3.0.4-1.6.aarch64.rpm"
RPM_HASH = "aaf531235a535c04395bc59cb662b160afd88eb93e571949656789ab6d35874f8ef33bdaeec61e4a2a3ab879a22f86db2a33e77ed66f2a45f87c5e091855595d"

RPROVIDES:${PN} += "pkgconfig-zimg \
zimg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzimg2"

inherit rpm
