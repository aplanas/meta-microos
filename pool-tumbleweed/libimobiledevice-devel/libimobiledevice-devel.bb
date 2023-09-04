SUMMARY = "Development files for libimobiledevice"
DESCRIPTION = "The libimobiledevice-devel package contains libraries and header files for \
developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+190git.20230705"

RPM_NAME = "libimobiledevice-devel-1.3.0+190git.20230705-1.1.aarch64.rpm"
RPM_HASH = "0af579425b5858f993ee524b1d5d6c211dfa8fd52767481e670639815e5f7b8e1971fe8251d412d9bd5b7e85e285b4c29596c5c0a77fdcf67f8cd234d108b326"

RPROVIDES:${PN} += "libimobiledevice-devel \
pkgconfig-libimobiledevice-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-1-0-6 \
pkgconfig-libimobiledevice-glue-1.0 \
pkgconfig-libplist-2.0 \
pkgconfig-libusbmuxd-2.0 \
pkgconfig-openssl"

inherit rpm
