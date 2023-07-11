SUMMARY = "Partial kernel dump"
DESCRIPTION = "makedumpfile is a dump program to shorten the size of dump file. It \
copies only the necessary pages for analysis with various dump levels, \
and can compress the page data. The obtained dump file can by analyzed \
via gdb or crash utility."
LICENSE = "GPL-2.0-only"

PV = "1.7.3"

RPM_NAME = "makedumpfile-1.7.3-1.2.aarch64.rpm"
RPM_HASH = "9944f806f8d5b28c1013cab2ac6d6c6925af00086499c65fc7ab070b2efe2bd3e8dcef1f4703742ad740345745a28973e387f39c4e7a8f17fda6e2dedfa5c3a9"

RPROVIDES:${PN} += "makedumpfile"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
liblzo2.so.2 \
libsnappy.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
