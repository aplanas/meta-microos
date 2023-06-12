SUMMARY = "Dictionary-based LZ-type compressor favoring speed"
DESCRIPTION = "lzop is a general-purpose file compressor similar to gzip. \
It favors higher compression and decompression speed at the cost \
of compression ratio. \
 \
lzop was designed with the following goals in mind: \
- speed (both compression and decompression) \
- reasonable drop-in compatibility to gzip \
- portability"
LICENSE = "GPL-2.0-or-later"

PV = "1.04"

RPM_NAME = "lzop-1.04-4.12.aarch64.rpm"
RPM_HASH = "e6fbe0b912026c07b87f7d4b4b3433a24f4efc428f9bb7c864eb8446a24156deff00d6e37b38657dc21d898bfd0cd446dd10b9ece5f9f098086a2e81d1497fe0"

RPROVIDES:${PN} += "lzop \
lzop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblzo2.so.2()(64bit)"

inherit rpm
