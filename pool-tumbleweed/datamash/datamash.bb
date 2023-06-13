SUMMARY = "Statistical, numerical and textual operations in the command line"
DESCRIPTION = "GNU datamash is a command-line program which performs basic numeric, \
textual and statistical operations on input textual data files."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "datamash-1.8-1.8.aarch64.rpm"
RPM_HASH = "c3960b2c7429cb34215fe10968381bc00fcd775c99ffaeca0e74804c4f5753d41c94203402bd4e8c50664fd33a2eb3d1bbc967ae51b57b964959d12bd9a25bb6"

RPROVIDES:${PN} += "datamash \
datamash(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
