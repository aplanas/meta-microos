SUMMARY = "Provides message digest functions from BSD systems"
DESCRIPTION = "The libmd library provides a few message digest ('hash') functions, as \
found on various BSDs on a library with the same name and with a compatible \
API. \
 \
Digests supported: MD2/4/5, RIPEMD160, SHA1, SHA2-256/384/512."
LICENSE = "BSD-2-Clause | BSD-3-Clause | ISC | SUSE-Public-Domain"

PV = "1.0.4"

RPM_NAME = "libmd-devel-1.0.4-1.7.aarch64.rpm"
RPM_HASH = "30337163432db77222fd5ffcd907400923cfc38e4044e638c3263f2bb8bd460a238369e4b09b68d152f5b49a816f8606a0f891fd8e188a289e8cf7a9a54b31f5"

RPROVIDES:${PN} += "libmd-devel \
libmd-devel(aarch-64) \
pkgconfig(libmd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmd0"

inherit rpm
