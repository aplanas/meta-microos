SUMMARY = "Development files for libcdio-paranoia"
DESCRIPTION = "The libcdio-paranoia-devel package contains libraries and header files for \
developing applications that use libcdio-paranoia."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio-paranoia-devel-10.2+2.0.1-1.9.aarch64.rpm"
RPM_HASH = "f4fde8adda32a80f1b8cf4856eaf0366949f946cef0a925659967a65f68dd32721f50fba60ce4339b4a20764d597b3a337caa0925dba521e1e6ef36961881ec0"

RPROVIDES:${PN} += "libcdio-paranoia-devel \
pkgconfig-libcdio-cdda \
pkgconfig-libcdio-paranoia"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdio-cdda2 \
libcdio-paranoia2 \
pkgconfig-libcdio"

inherit rpm
