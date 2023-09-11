SUMMARY = "Distributed version control system based on a theory of patches"
DESCRIPTION = "Pijul is a distributed version control system. Its distinctive feature is to be \
based on a theory of patches, which makes it really distributed."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.6"

RPM_NAME = "pijul-1.0.0~beta.6-1.1.aarch64.rpm"
RPM_HASH = "8a918b8cd820af0de6aca89db40c79125a6254b825277e0f2f52175112f09badbfd75af25d9d65c88f057ecee7d87d4d75eb0ecf57781ddfe336dc64bd7f6731"

RPROVIDES:${PN} += "pijul"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
