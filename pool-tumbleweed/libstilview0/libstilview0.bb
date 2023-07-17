SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "libstilview0-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "07723c503b8853ce955221170a9b314f8b6d10ee8d43bd1bad97890b64ed29896d7d5a1c14143f8c535caac7466e1c9c5d1aee1b5aa62402b6f7ff63c8fc1131"

RPROVIDES:${PN} += "libstilview.so.0 \
libstilview0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
