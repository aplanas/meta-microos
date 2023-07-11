SUMMARY = "Dynamic Universal Music Bibliotheque"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-2.0.3-1.10.aarch64.rpm"
RPM_HASH = "edfdec8b7ae2449e7f543db74cb1de47252b3b4536abacda77dbe294c3cf893d1aac3fb26c83f831d5cb4a7997621a5cc1d19fe846c358e4e90272fd41659a92"

RPROVIDES:${PN} += "dumb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libargtable2.so.0 \
libc.so.6 \
libdumb.so.2"

inherit rpm
