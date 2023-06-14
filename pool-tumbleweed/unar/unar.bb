SUMMARY = "Multi-format unarchiver"
DESCRIPTION = "The Unarchiver is originally a Mac OS X application. This package \
contains a command-line variant of it. Unarchiver handles ZIP, ZIPX, \
RAR, 7z, tar, gzip, bzip2, lzma, xz, CAB, MSI, NSIS, some \
self-extracting EXEs, cpio, and further obscure and old formats, as \
well as disc images in ISO, BIN, MDF, NRG, CDI. It supports filenames \
in foreign character sets."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.7"

RPM_NAME = "unar-1.10.7-1.25.aarch64.rpm"
RPM_HASH = "a43eb0da40c379dad95c8b07021905bf5c1175f4254bc03fe2b79fec8abf5cdd4e332f32fb26e57dbfbb34664eb516b035f91e38e86b8f9681a77c14b79933e5"

RPROVIDES:${PN} += "unar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnustep-base.so.1.29 \
libicuuc.so.73 \
libm.so.6 \
libobjc.so.4 \
libstdc++.so.6 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
