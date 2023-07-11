SUMMARY = "C utilities collection library itself"
DESCRIPTION = "C utilities collection library itself."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "libchck0-0.0.20161208-1.26.aarch64.rpm"
RPM_HASH = "25b9d7f72c8add7b3fcec6227442ff8419e9c9a02c61a773f29beda1b2668b528abfb2bb7bd2a2823a1e48d748b7b5fd1e4cc8fd9148adf70baf24a53089e691"

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
