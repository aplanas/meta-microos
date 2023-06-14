SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libsidplayfp6-2.4.2-2.1.aarch64.rpm"
RPM_HASH = "dfe6e83e4ffed37bf4412e597458d772f643742ab9887967f9c7ba269af2a4353574b89733f9fd45f24112f8e871575576ba50f9ca85808d2329dd9684eae339"

RPROVIDES:${PN} += "libsidplayfp.so.6 \
libsidplayfp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
