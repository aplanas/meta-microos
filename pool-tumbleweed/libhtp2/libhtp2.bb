SUMMARY = "Library for HTTP normalizer and parser"
DESCRIPTION = "The HTP Library is an HTTP normalizer and parser written by Ivan Ristic of Mod Security fame for the OISF. This integrates and provides very advanced processing of HTTP streams for Suricata. The HTP library is required by the engine, but may also be used independently in a range of applications and tools."
LICENSE = "BSD-3-Clause"

PV = "0.5.43"

RPM_NAME = "libhtp2-0.5.43-1.1.aarch64.rpm"
RPM_HASH = "ec109a70b1748a23d30e56c287a4e738a598cca3ec315f8158976c4651bdcfa0f5c248f002428148321e7ed23d8a1925deefd99ad09a9d1198d04d6350e1f295"

RPROVIDES:${PN} += "libhtp.so.2()(64bit) \
libhtp2 \
libhtp2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
