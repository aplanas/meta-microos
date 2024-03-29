SUMMARY = "TLS/SSL FTP wrapper/proxy"
DESCRIPTION = "TLS/SSL FTP wrapper/proxy, allowing you to use your favorite FTP client with \
any TLS/SSL-enabled FTP server."
LICENSE = "BSD-3-Clause"

PV = "1.04"

RPM_NAME = "tlswrap-1.04-3.21.aarch64.rpm"
RPM_HASH = "4de9ff94a15442ca7c155fd92427dfcaecf157667308b7f0d1d6fe3ea562f856ffc54431a8d92f364f1c3efd468cee1cdcbe9797197732885bba085b4c130b0d"

RPROVIDES:${PN} += "tlswrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
