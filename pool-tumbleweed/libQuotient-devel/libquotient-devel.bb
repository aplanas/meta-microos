SUMMARY = "Development files for libQuotient"
DESCRIPTION = "The libQuotient devel package contains libraries and header files for \
developing applications that use libQuotient."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1.1"

RPM_NAME = "libQuotient-devel-0.8.1.1-1.1.aarch64.rpm"
RPM_HASH = "1bcbebb815920703443d191a47e3f156702790eea9c7ce521938fd3f3431a67000cdc3c4c89f6c3c2cb29fc052c5f1817e96d0c77e1f5936b03ab5e3c9f151d0"

RPROVIDES:${PN} += "cmake-Quotient \
libQuotient-devel \
pkgconfig-Quotient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Olm \
cmake-Qt5Gui \
cmake-Qt5Keychain \
cmake-Qt5Multimedia \
cmake-Qt5Network \
cmake-Qt5Sql \
libQuotient0-8 \
pkgconfig-openssl"

inherit rpm
