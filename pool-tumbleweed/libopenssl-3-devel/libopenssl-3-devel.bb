SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl-3-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "fbcaa18b3589ffb9305e4a61c13ddc683d388f5e1d5cf5c6b3055716363b26e9fec0062d997666f21561b6d268e6c2622c559e10e79d3644d83f38866943bb88"

RPROVIDES:${PN} += "libopenssl-3-devel \
libopenssl-3-devel(aarch-64) \
pkgconfig(libcrypto) \
pkgconfig(libssl) \
pkgconfig(openssl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl3 \
pkgconfig(libcrypto) \
pkgconfig(libssl) \
pkgconfig(zlib)"

inherit rpm
