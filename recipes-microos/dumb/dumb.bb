SUMMARY = "Dynamic Universal Music Bibliotheque"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-2.0.3-1.9.aarch64.rpm"
RPM_HASH = "177d8479bac551c952f310a97cdb31f4e24e8249f270659444a6e0e802dbd3eb61e1cd12103cf8d1662da00e4ec852e35b615085e607d244c45151a4fdbdd6a4"

RPROVIDES:${PN} += "dumb \
dumb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libargtable2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdumb.so.2()(64bit)"

inherit rpm
