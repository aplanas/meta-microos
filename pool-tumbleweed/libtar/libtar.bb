SUMMARY = "Tar file manipulation API"
DESCRIPTION = "libtar is a C library for manipulating POSIX tar files. It handles adding \
and extracting files to/from a tar archive."
LICENSE = "BSD-3-Clause"

PV = "1.2.20"

RPM_NAME = "libtar-1.2.20-2.16.aarch64.rpm"
RPM_HASH = "a4e095fd9c1af8251a489ed56ee82deb0485969a11c9376eaef538b8f350196714efc80ee618711a5f75cbbe60b93fdfe30a3b19b5a41e0581f1a4f534da3fc7"

RPROVIDES:${PN} += "libtar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtar.so.1 \
libz.so.1"

inherit rpm
