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

RPM_NAME = "parzip-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "f2b8ddc28ed1d1f719d364b3c2d8b4574973883ddbccf97af40f7f076bc1c66aa14ecafdd724c5dabb607f5afe5026f0f553bd53d5aa575a57267bb8f0aabebf"

RPROVIDES:${PN} += "parzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
