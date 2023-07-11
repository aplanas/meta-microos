SUMMARY = "Development files for libisds"
DESCRIPTION = "The libisds-devel package contains libraries and header files for \
developing applications that use libisds."
LICENSE = "LGPL-3.0-or-later"

PV = "0.11.2"

RPM_NAME = "libisds-devel-0.11.2-1.5.aarch64.rpm"
RPM_HASH = "3bb1cbe11135b21e1cc2956b2779b8b1c220b6be1259c7b3fa0028a117c7f19ceeced5bd73a47a121241e572abb092231aadb47352b0c087e0eba3642e2d71c1"

RPROVIDES:${PN} += "libisds-devel \
pkgconfig-libisds"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisds5 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
