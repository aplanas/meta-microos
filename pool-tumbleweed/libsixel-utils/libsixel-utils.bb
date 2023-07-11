SUMMARY = "Utilities for the SIXEL encoder/decoder libsixel"
DESCRIPTION = "img2sixel and sixel2png utilities for libsixel, a C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-utils-1.10.3-1.8.aarch64.rpm"
RPM_HASH = "7c230abcf27f9c82b758ae3cad065ad23995916d5f031bbf0ba90b3105bbcf9c32c5bfd1e3ae7193196b8d2d908ccb7960c2fdfb3dcc098ef26241552e47a765"

RPROVIDES:${PN} += "libsixel-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsixel.so.1 \
libsixel1"

inherit rpm
