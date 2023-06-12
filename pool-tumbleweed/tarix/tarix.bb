SUMMARY = "Simple Indexer for GNU and POSIX Tar Files"
DESCRIPTION = "tarix is a simple indexer for GNU and POSIX tar files. The indexes allow fast \
extraction of files in the archive, especially on seekable tape devices. The \
index format is simple enough to be used from a rescue disk with only mt, \
dd, and tar (though grep and sed would be very useful there)."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "tarix-1.0.9-1.11.aarch64.rpm"
RPM_HASH = "80b148a632a939dc1bf30bb6e99e27d251b705c88d777610071c7233432773ff9d45add8b58ed2129e88fab5e3806995cd7dd36b712c003d1dffbd36a119ead9"

RPROVIDES:${PN} += "tarix \
tarix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm