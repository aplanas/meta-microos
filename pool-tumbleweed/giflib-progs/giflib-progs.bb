SUMMARY = "Tools for Working with the GIF Library"
DESCRIPTION = "A tool for converting GIFs to various formats."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "giflib-progs-5.2.1-3.4.aarch64.rpm"
RPM_HASH = "1e1ee1c6b32a2b852a0339f749752ca3eabf21ddfd178b88eff226ea8ed88571e29606f5085fb8057f28073f4a9b0bfff35d216b0c83d52f4ff0bd736247c757"

RPROVIDES:${PN} += "giflib-progs \
ungif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
