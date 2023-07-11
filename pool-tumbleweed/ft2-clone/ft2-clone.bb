SUMMARY = "Fasttracker II clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
Fasttracker II. It can load XM, MOD, S3M, STM module files."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.66"

RPM_NAME = "ft2-clone-1.66-1.2.aarch64.rpm"
RPM_HASH = "02e349161acfe9693f5ca0d1c113fe22d808e9cbebd57c544cb70fb658f1e721ddebf1284b4b9dc2e5d8542fe71fc55c70859ea3347b9f4422393617a9870520"

RPROVIDES:${PN} += "bundled-rtmidi \
ft2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
