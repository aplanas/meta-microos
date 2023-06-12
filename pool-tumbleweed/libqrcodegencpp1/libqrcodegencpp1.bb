SUMMARY = "QR Code generator library"
DESCRIPTION = "C++ QR Code generator library"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libqrcodegencpp1-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "4ace911f5ba748c2a2bc5cd01207a51c193252106b0009ffec7a33bf7b6d0083652b37eb6d4c1b3861384fad2bc4795d5ef4dd1d37d5288eebb539cfdc879f89"

RPROVIDES:${PN} += "libqrcodegencpp.so.1()(64bit) \
libqrcodegencpp1 \
libqrcodegencpp1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit)"

inherit rpm
