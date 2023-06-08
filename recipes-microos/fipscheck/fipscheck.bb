SUMMARY = "A library for integrity verification of FIPS validated modules"
DESCRIPTION = "FIPSCheck is a library for integrity verification of FIPS validated \
modules. The package also provides helper binaries for creation and \
verification of the HMAC-SHA256 checksum files."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "fipscheck-1.7.0-1.4.aarch64.rpm"
RPM_HASH = "766b5cd78ae10ad0601b4348a084106244d8b1a357c9c5ca6bd53828682b1dc3caf986e51055e728e8bb977e064ea5d15716dff053a5baf392909d806fea9755"

RPROVIDES:${PN} += "fipscheck fipscheck(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfipscheck.so.1()(64bit) libfipscheck1"

inherit rpm
