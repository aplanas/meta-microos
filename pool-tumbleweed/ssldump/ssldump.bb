SUMMARY = "SSLv3/TLS Network Protocol Analyzer"
DESCRIPTION = "ssldump is an SSLv3/TLS network protocol analyzer. It identifies TCP \
connections on the chosen network interface and attempts to interpret \
them as SSLv3/TLS traffic. When it identifies SSLv3/TLS traffic, it \
decodes the records and outputs them in a textual form to stdout. If \
provided with the appropriate keying material, it also decrypts the \
connections and displays the application data traffic."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ssldump-1.6-1.2.aarch64.rpm"
RPM_HASH = "02a0f8fc418730050f52d1e0964375290a09e4f7bc865eb13afa0ebbbe997df041b45f6e1b1b2792f17b15faeb26495f7bbf00e67e5581df36b85e3cf6d305ff"

RPROVIDES:${PN} += "ssldump \
ssldump(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libnet.so.9()(64bit) \
libpcap.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm