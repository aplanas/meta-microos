SUMMARY = "Development files for the Yubikey NEO PKCS#11 applet library"
DESCRIPTION = "This package contains the header file needed to develop applications that use \
Yubikey NEO PKCS#11 applet library."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykcs11-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "1654d1f261f1cd2fa1737b8e3b3dd1b37f1f3a4b253b020bfb5f64829c71edcdac4aaf958708c07c79af15d7cef6ee616f9c165f92a42988a1da22ed31845842"

RPROVIDES:${PN} += "libykcs11-devel \
pkgconfig-ykcs11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libykcs11-2"

inherit rpm
