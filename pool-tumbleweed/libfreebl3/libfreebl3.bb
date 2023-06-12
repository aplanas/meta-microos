SUMMARY = "Freebl library for the Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
This package installs the freebl library from NSS."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libfreebl3-3.89-2.1.aarch64.rpm"
RPM_HASH = "70d22fde8eda333f1b073ae6ee29105e9ef9d7df0561adab3fa51bad9fce3340d55822ce9db9169aaebbd975034e08008586a79fe4ac0b11d29a90c404ae6756"

RPROVIDES:${PN} += "libfreebl3 \
libfreebl3(aarch-64) \
libfreebl3.so()(64bit) \
libfreebl3.so(NSSRAWHASH_3.12.3)(64bit) \
libfreebl3.so(NSSprivate_3.11)(64bit) \
libfreeblpriv3.so()(64bit) \
libfreeblpriv3.so(NSSprivate_3.11)(64bit) \
libfreeblpriv3.so(NSSprivate_3.16)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
