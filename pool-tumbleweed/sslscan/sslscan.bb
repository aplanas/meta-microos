SUMMARY = "SSL cipher scanning tool"
DESCRIPTION = "SSLScan determines what ciphers are supported on SSL-based services, \
such as HTTPS. Furthermore, SSLScan will determine the preferred \
ciphers of the SSL service."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "2.0.16"

RPM_NAME = "sslscan-2.0.16-1.2.aarch64.rpm"
RPM_HASH = "95cb64acf2a5959313b4708aa01793a82b111446cbf550231dbf9eeb5177231d4148da6d8d73cd04342e488d3df5fd2757f75638c0e313fd613fd36f168bdc8c"

RPROVIDES:${PN} += "sslscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
