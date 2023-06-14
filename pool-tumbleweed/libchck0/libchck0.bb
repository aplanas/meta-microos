SUMMARY = "C utilities collection library itself"
DESCRIPTION = "C utilities collection library itself."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "libchck0-0.0.20161208-1.25.aarch64.rpm"
RPM_HASH = "ca05c8934e3718b784dddb66e691fcbd9015207375fe09dee4c7a3ca7caf7f498e32bf768813ac181404d85632d9684f845e8e3b691d77d8d2552887669a41c2"

RPROVIDES:${PN} += "libchck-atlas.so.0 \
libchck-buffer.so.0 \
libchck-dl.so.0 \
libchck-fs.so.0 \
libchck-lut.so.0 \
libchck-pool.so.0 \
libchck-sjis.so.0 \
libchck-string.so.0 \
libchck-tqueue.so.0 \
libchck-unicode.so.0 \
libchck-xdg.so.0 \
libchck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
