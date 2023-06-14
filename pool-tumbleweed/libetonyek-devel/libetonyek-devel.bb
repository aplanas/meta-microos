SUMMARY = "Files for Developing with libetonyek"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications. \
 \
This package contains the libetonyek development files."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-devel-0.1.10-1.11.aarch64.rpm"
RPM_HASH = "2779e00ad60437b443d7345129e0b3ca2fa16e490a6663fbed25afbae7d1055279c1a2c6f3b0b3d85684ab5a43f049e752b2dfc1eb9730b80b7280af924fa9c8"

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
