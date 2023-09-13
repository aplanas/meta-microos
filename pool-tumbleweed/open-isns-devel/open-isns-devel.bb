SUMMARY = "Development files for open-isns"
DESCRIPTION = "Files to develop an application using the open-isns library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "open-isns-devel-0.102-2.1.aarch64.rpm"
RPM_HASH = "38225bcfe482d253d61e8796948acf8b6dc3dad5e43f0feaa23192e56c95e5f68e11818d66d02f95a2409dec588d393cb791931b522c2c05d8641a706ddfceb2"

RPROVIDES:${PN} += "open-isns-devel \
pkgconfig-libisns"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
open-isns \
pkgconfig-libcrypto"

inherit rpm
