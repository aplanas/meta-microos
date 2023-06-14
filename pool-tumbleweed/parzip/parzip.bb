SUMMARY = "Parallel pkzip implementation"
DESCRIPTION = "A command line utility to pack and unpack zip archives using \
multiple threads. \
 \
Supports \
    both zipping and unzipping \
    multithreading \
    uncompressed (i.e. stored) files \
    deflate and lzma compression and decompression \
    ZIP64 extensions (i.e. >4 GB files) \
    unix file attributes \
 \
Does not support \
    modifying existing archives \
    encryption (zip encryption is broken, use GPG instead) \
    ancient compression methods \
    archives split to multiple files"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "parzip-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "855433fb43553db6d667d94aa360b463afa567b5aabb5f7846334683295df6a61368fadcc3e84182929fd32a6f07ffd5e630dc22d2c16684960b706294294055"

RPROVIDES:${PN} += "parzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
