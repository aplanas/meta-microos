SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "The 'crypto' library implements a wide range of cryptographic \
algorithms used in various Internet standards. The services provided \
by this library are used by the LibreSSL implementations of SSL, TLS \
and S/MIME, and they have also been used to implement SSH, OpenPGP, \
and other cryptographic standards."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libcrypto50-3.7.0-1.2.aarch64.rpm"
RPM_HASH = "077e36b85ae6183367de9bd53a8915f17a4f506f9872a3ec1d19572462178c87c9e278cc193176232cb074dfea891d595687203c158f1a5fc5988e3d30f868c5"

RPROVIDES:${PN} += "libcrypto.so.50()(64bit) \
libcrypto.so.50(LIBRESSL)(64bit) \
libcrypto50 \
libcrypto50(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
