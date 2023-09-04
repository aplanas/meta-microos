SUMMARY = "Extra engines for ScummVM"
DESCRIPTION = "lastexpress and toltecs engines for ScummVM. \
These engines are in a worse state, but allow to play extra games."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "scummvm-extra-2.7.1-1.1.aarch64.rpm"
RPM_HASH = "8e7b2ba62e7f310bf11c069c6b17a13c931e2b68e8e22e4fe4b83a2247524b2b8a6b1ad9dbbefa19e05dc5f228bb7de271300d06c970963c764c80b95a088d14"

RPROVIDES:${PN} += "liblastexpress.so \
libwintermute.so \
scummvm-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
scummvm"

inherit rpm
