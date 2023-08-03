SUMMARY = "Development files for libnvme"
DESCRIPTION = "The libnvme-devel package contains libraries and header files for \
developing applications that use libnvme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-devel-1.4-3.1.aarch64.rpm"
RPM_HASH = "9bb8c73721609213832afaf17f4a41e060121706c9045e49bc2768bd0076649b33fe0a13ecae7763ea1ae363f06d6910020819c45e61c6b362600705383204d6"

RPROVIDES:${PN} += "libnvme-devel \
pkgconfig-libnvme \
pkgconfig-libnvme-mi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvme-mi1 \
libnvme1 \
pkgconfig-json-c \
pkgconfig-libkeyutils \
pkgconfig-openssl"

inherit rpm
