SUMMARY = "Distributed software configuration management"
DESCRIPTION = "Fossil is a distributed software configuration management system with \
these features: \
* integrated bug tracking and wiki \
* built-in web-interface \
* uses HTTP, with proxy support \
* everything is in a single executable and CGI-enabled \
* sqlite-backed database"
LICENSE = "BSD-2-Clause"

PV = "2.22"

RPM_NAME = "fossil-2.22-1.1.aarch64.rpm"
RPM_HASH = "882270fef68036255da4f01c87465a6668b30902b8212227d4104cc6f85a0db93b2eae913252797e157bec8aabbf523d04a0ecdfd1cd9b11bdf3826788832c77"

RPROVIDES:${PN} += "fossil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libm.so.6 \
libresolv.so.2 \
libssl.so.3 \
libz.so.1"

inherit rpm
