SUMMARY = "Tools to work with documents in Corel Draw file format"
DESCRIPTION = "Tools to work with documents in Corel Draw file format."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-tools-0.1.7-1.18.aarch64.rpm"
RPM_HASH = "b4e7c02ff11e0da65246a93524d940f2e03d4da15a79c3b99b0c9192a7e64fb52100441a003e0debacaf8093c8437a6699e67d07f544d2a8278047008dfd6502"

RPROVIDES:${PN} += "libcdr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdr-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
