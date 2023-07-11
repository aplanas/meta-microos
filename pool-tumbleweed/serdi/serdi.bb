SUMMARY = "Read and write RDF syntax"
DESCRIPTION = "Read and write RDF syntax."
LICENSE = "ISC"

PV = "0.30.16"

RPM_NAME = "serdi-0.30.16-1.2.aarch64.rpm"
RPM_HASH = "b98072df76d78ccb6cb848d5f7f0d77d5fb5a107b9cb67e2e24089b25cf6b3176eeef33345518d633d3676c1c50df30f70ce80a0fbdaee84299c3642599571bf"

RPROVIDES:${PN} += "serdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0.so.0"

inherit rpm
