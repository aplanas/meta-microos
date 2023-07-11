SUMMARY = "Development files for libqtolm"
DESCRIPTION = "The libqtolm-devel package contains libraries and header files for \
developing applications that use libqtolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libqtolm-devel-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "94113582a7a3a9f2f1f1100a097f81b1bd9c2b60fbb77f08b62deb21a61c2045ac53bd728769dfcda2c63afc61a03f350ffface6a5325308dc060fb6a12f5dad"

RPROVIDES:${PN} += "cmake-QtOlm \
libqtolm-devel \
pkgconfig-QtOlm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQtOlm3-0"

inherit rpm
