SUMMARY = "Development files for libQuotient"
DESCRIPTION = "The libQuotient-devel package contains libraries and header files for \
developing applications that use libQuotient."
LICENSE = "LGPL-2.1-only"

PV = "0.6.11"

RPM_NAME = "libQuotient-devel-0.6.11-2.4.aarch64.rpm"
RPM_HASH = "7549dab6347813d2ce37733f9924bafab579d4a57e5efb0bb08be9940e2164920bda59d76c8765a4e12476ddd11c136a43c6ddc504614b185c92734caa4b742f"

RPROVIDES:${PN} += "cmake-Quotient \
libQuotient-devel \
pkgconfig-Quotient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQuotient0-6"

inherit rpm
