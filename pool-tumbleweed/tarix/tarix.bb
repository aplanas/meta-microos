SUMMARY = "Simple Indexer for GNU and POSIX Tar Files"
DESCRIPTION = "tarix is a simple indexer for GNU and POSIX tar files. The indexes allow fast \
extraction of files in the archive, especially on seekable tape devices. The \
index format is simple enough to be used from a rescue disk with only mt, \
dd, and tar (though grep and sed would be very useful there)."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "tarix-1.0.9-1.12.aarch64.rpm"
RPM_HASH = "f378b5092dc50e75dff0282cdcb5fae7a9a420e402104e457216557af50566d2dc72043c26ac6a56cec6e43bbcfd10e313c6f6885825c719f8da46c621e214c1"

RPROVIDES:${PN} += "tarix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libglib-2.0.so.0 \
libz.so.1"

inherit rpm
