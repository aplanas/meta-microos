SUMMARY = "Extra engines for ScummVM"
DESCRIPTION = "lastexpress and toltecs engines for ScummVM. \
These engines are in a worse state, but allow to play extra games."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "scummvm-extra-2.7.0-2.4.aarch64.rpm"
RPM_HASH = "7da085b06cb2cf350044194ed814193c6c2ad16d60f82ce6ba24642a2ef93a12404ddd8129880cf70d31577305ec8631229f896b27b75231358aec021cf2009f"

RPROVIDES:${PN} += "liblastexpress.so \
libwintermute.so \
scummvm-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
scummvm"

inherit rpm
