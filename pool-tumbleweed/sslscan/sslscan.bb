SUMMARY = "SSL cipher scanning tool"
DESCRIPTION = "SSLScan determines what ciphers are supported on SSL-based services, \
such as HTTPS. Furthermore, SSLScan will determine the preferred \
ciphers of the SSL service."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "2.0.16"

RPM_NAME = "sslscan-2.0.16-1.1.aarch64.rpm"
RPM_HASH = "b63f8e15e8dafa636489cde2ac8efd7579cf17a982e3b60e6f1c2d9de767387f0174b0edb36b4cf9b0dbff7933ddc012a454bb42b581f603e0732e38044a2c40"

RPROVIDES:${PN} += "sslscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
