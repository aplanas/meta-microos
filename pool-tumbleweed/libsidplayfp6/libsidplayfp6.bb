SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "libsidplayfp6-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "00c8756661bab8c6e659fe65362478062be4192b3659583eb4e28604184a0a04c3f97d91f16323d77ee6ce7821df397f93be4d4fd7454d1e95a6d2cb54d52fe0"

RPROVIDES:${PN} += "libsidplayfp.so.6 \
libsidplayfp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
