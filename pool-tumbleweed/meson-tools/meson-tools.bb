SUMMARY = "Utilities for Amlogic SoCs"
DESCRIPTION = "Utilities for working with Amlogic 'Meson' SoCs"
LICENSE = "GPL-2.0+ & MIT"

PV = "0.1"

RPM_NAME = "meson-tools-0.1-1.24.aarch64.rpm"
RPM_HASH = "e02793f5e3cddd1b82935c4b275c11d21c5214e535bc8208090e892d26893db7145c44f34ada331e8e32d6f23c4c22d4513f2f62671c2f586a024ece3070425a"

RPROVIDES:${PN} += "meson-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
