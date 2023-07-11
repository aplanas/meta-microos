SUMMARY = "Development files for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-devel package contains libraries and header files for \
developing applications that use libstoragemgmt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-devel-1.9.8-1.2.aarch64.rpm"
RPM_HASH = "30f26f038d2d9ddc2df04080a8004dd67ac8e0b45867b54f1777078828c39d7f8e6b2fad43445382cf8d135a3f8b6e5754d022d488f9df9e9ed0b6dd17cfdc47"

RPROVIDES:${PN} += "libstoragemgmt-devel \
pkgconfig-libstoragemgmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstoragemgmt1"

inherit rpm
