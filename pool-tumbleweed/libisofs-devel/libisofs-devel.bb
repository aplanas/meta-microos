SUMMARY = "Development Files for libisofs"
DESCRIPTION = "Development files for developing applications using libisofs."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libisofs-devel-1.5.6-2.1.aarch64.rpm"
RPM_HASH = "490ef2abebed0672e2a9852bf74d9eacd477235d8d96d273f3e3cf244903312af6cf76f60a98a87e6fece35e38dfc2c5680580f3c2f1316aa08bab7512f0dcbd"

RPROVIDES:${PN} += "libisofs-devel \
pkgconfig-libisofs-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisofs6"

inherit rpm
