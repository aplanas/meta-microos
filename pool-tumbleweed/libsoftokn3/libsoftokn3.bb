SUMMARY = "Network Security Services Softoken Module"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
Network Security Services Softoken Cryptographic Module"
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libsoftokn3-3.89-2.1.aarch64.rpm"
RPM_HASH = "e40f0f2a571125fd0a0ab2882e7dfb218872d6370be15e484796913e78a1be94711ff1980059b3f322add78df935e5b4e03900ff0dcf393693e27c029aaeba63"

RPROVIDES:${PN} += "libnssdbm3.so()(64bit) \
libnssdbm3.so(NSSDBM_3.12)(64bit) \
libsoftokn3 \
libsoftokn3(aarch-64) \
libsoftokn3.so()(64bit) \
libsoftokn3.so(NSS_3.4)(64bit) \
libsoftokn3.so(NSS_3.52)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreebl3 \
libnspr4.so()(64bit) \
libnssutil3.so()(64bit) \
libnssutil3.so(NSSUTIL_3.12)(64bit) \
libnssutil3.so(NSSUTIL_3.12.3)(64bit) \
libnssutil3.so(NSSUTIL_3.12.5)(64bit) \
libnssutil3.so(NSSUTIL_3.14)(64bit) \
libnssutil3.so(NSSUTIL_3.17.1)(64bit) \
libnssutil3.so(NSSUTIL_3.24)(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
