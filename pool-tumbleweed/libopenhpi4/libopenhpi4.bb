SUMMARY = "OpenHPI base libraries"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). \
 \
This subpackage contains the OpenHPI base libraries."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "libopenhpi4-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "46247807b4bb5d63bf20266e6300200ed17d47e6cf2dbff3cbc469401d121ddc753de1712f0fe5fdfac0b5da94d150995606b005a7b88f45026b7226e59fa163"

RPROVIDES:${PN} += "libopenhpi.so.4()(64bit) \
libopenhpi4 \
libopenhpi4(aarch-64) \
libopenhpi_ssl.so.4()(64bit) \
libopenhpimarshal.so.4()(64bit) \
libopenhpitransport.so.4()(64bit) \
libopenhpiutils.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
