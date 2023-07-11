SUMMARY = "Files for Developing with libetonyek"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications. \
 \
This package contains the libetonyek development files."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-devel-0.1.10-1.12.aarch64.rpm"
RPM_HASH = "b7d29cac0441e6305430a86a41fcf0346d6ace20c86d5158c537f81d158fc44224e8fd4f728cb731fa81cac765f3b307a4d41b04172796b9bea5d813f79cb46e"

RPROVIDES:${PN} += "libetonyek-devel \
pkgconfig-libetonyek-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libetonyek-0-1-1 \
libwpd-devel \
pkgconfig-liblangtag \
pkgconfig-librevenge-0.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
