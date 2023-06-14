SUMMARY = "The GNU Parser Generator"
DESCRIPTION = "Bison is a parser generator similar to yacc(1)."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "bison-3.8.2-3.3.aarch64.rpm"
RPM_HASH = "311860f2f484e28dca11f64b4c72f6d4208045bdc1025135285a785ba39b980eb0cfce67957a9d2bd8d0be368a8d32bb806e5aec5416da702cd2a2e162cc2339"

RPROVIDES:${PN} += "bison"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
m4"

inherit rpm
