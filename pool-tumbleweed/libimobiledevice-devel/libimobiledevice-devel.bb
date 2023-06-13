SUMMARY = "Development files for libimobiledevice"
DESCRIPTION = "The libimobiledevice-devel package contains libraries and header files for \
developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+git.20210921"

RPM_NAME = "libimobiledevice-devel-1.3.0+git.20210921-1.8.aarch64.rpm"
RPM_HASH = "4a4d65a5c43b5e3d28d202f2b467dacb706a086fa26f2fffed5258a6df83d0c5935c986504cee4d93afbddab7a88fe408c28e06741edbb35c2a26714f0a7744b"

RPROVIDES:${PN} += "libimobiledevice-devel \
libimobiledevice-devel(aarch-64) \
pkgconfig(libimobiledevice-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-1_0-6 \
pkgconfig(libimobiledevice-glue-1.0) \
pkgconfig(libplist-2.0) \
pkgconfig(libusbmuxd-2.0) \
pkgconfig(openssl)"

inherit rpm
