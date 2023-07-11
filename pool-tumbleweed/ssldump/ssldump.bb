SUMMARY = "SSLv3/TLS Network Protocol Analyzer"
DESCRIPTION = "ssldump is an SSLv3/TLS network protocol analyzer. It identifies TCP \
connections on the chosen network interface and attempts to interpret \
them as SSLv3/TLS traffic. When it identifies SSLv3/TLS traffic, it \
decodes the records and outputs them in a textual form to stdout. If \
provided with the appropriate keying material, it also decrypts the \
connections and displays the application data traffic."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ssldump-1.6-1.3.aarch64.rpm"
RPM_HASH = "8f68ad3d4ebdbb3f41e4091ddf65d6dd90d411bb327f5e39c000d52893c9cf05b7d4b75a1162e027321b2c02af2fea1d7278d23c606330c3520a07a9ea347584"

RPROVIDES:${PN} += "ssldump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libnet.so.9 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
