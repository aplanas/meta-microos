SUMMARY = "Library That Implements Different Microsoft Compressions"
DESCRIPTION = "The purpose of libmspack is to provide both compression and \
decompression of some loosely related file formats used by Microsoft. \
Currently the most common formats are implemented."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "libmspack0-0.11-1.4.aarch64.rpm"
RPM_HASH = "973cd2bf3aedce0ecb898fe58da263c5b0b16cfd6ffa41c6ee54df7977f90eb65a398cced42c9735d24ee65091fc2e2ad166bfba7d1ea423986ffcdc2771e0ed"

RPROVIDES:${PN} += "libmspack.so.0 \
libmspack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
