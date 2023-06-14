SUMMARY = "Partial kernel dump"
DESCRIPTION = "makedumpfile is a dump program to shorten the size of dump file. It \
copies only the necessary pages for analysis with various dump levels, \
and can compress the page data. The obtained dump file can by analyzed \
via gdb or crash utility."
LICENSE = "GPL-2.0-only"

PV = "1.7.3"

RPM_NAME = "makedumpfile-1.7.3-1.1.aarch64.rpm"
RPM_HASH = "d48900ff0b8dfe976695e550e6f75a8fd0c2e995f98448abb8ab43c93eefeafb31eb0af0500e69e82b281b71017910bd2855ed87303b842b0d7d6d0fbe5a8c8c"

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
