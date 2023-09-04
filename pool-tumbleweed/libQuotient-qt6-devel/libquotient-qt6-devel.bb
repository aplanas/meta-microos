SUMMARY = "Development files for libQuotient"
DESCRIPTION = "The libQuotient devel package contains libraries and header files for \
developing applications that use libQuotient."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1.1"

RPM_NAME = "libQuotient-qt6-devel-0.8.1.1-1.1.aarch64.rpm"
RPM_HASH = "1bfb9a900bd595a38807fabc7d0bacb6ae095d2c37f56676fc1527764ce59e0a22edf7af82d47e2571bc6f045a17d019c09d7543fc9cf669b784fc33a3513460"

RPROVIDES:${PN} += "cmake-QuotientQt6 \
libQuotient-qt6-devel \
pkgconfig-QuotientQt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Olm \
cmake-Qt6Gui \
cmake-Qt6Keychain \
cmake-Qt6Network \
cmake-Qt6Sql \
libQuotientQt6-0-8 \
pkgconfig-openssl"

inherit rpm
