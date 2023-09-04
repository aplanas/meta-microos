SUMMARY = "Files for Developing with libetonyek"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications. \
 \
This package contains the libetonyek development files."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-devel-0.1.10-2.1.aarch64.rpm"
RPM_HASH = "6e02caaa717ec248e873475df52a448193aadbfc5925cd16c79ce8a0d020ffb40f221a7fd42b05f0e0055490f0565792e18402e1feca805f438f89a4bd2d5ff3"

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
