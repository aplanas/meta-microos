SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libsidplayfp6-2.4.2-2.2.aarch64.rpm"
RPM_HASH = "94188951ada1b92705341487ccc76be415184e2a06eb0001c16203cac0bbc8ff2440acad156d606ffd260c44b523ca688e78a4f81aace5af687e424b7c886aad"

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
