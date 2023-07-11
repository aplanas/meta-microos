SUMMARY = "Development files for libnvme"
DESCRIPTION = "The libnvme-devel package contains libraries and header files for \
developing applications that use libnvme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-devel-1.4-1.3.aarch64.rpm"
RPM_HASH = "3434656c88d35816fe99bfe9a457b3c004835a89d75f843b6bdc9b984745f92ea5211b07c1f01fd06573a6bda0045e0ddc2a0c71ad07743d2a0250fe0761b5fa"

RPROVIDES:${PN} += "libnvme-devel \
pkgconfig-libnvme \
pkgconfig-libnvme-mi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvme-mi1 \
libnvme1 \
pkgconfig-json-c \
pkgconfig-libkeyutils \
pkgconfig-openssl"

inherit rpm
