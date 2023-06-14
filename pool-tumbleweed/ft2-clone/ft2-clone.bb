SUMMARY = "Fasttracker II clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
Fasttracker II. It can load XM, MOD, S3M, STM module files."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.66"

RPM_NAME = "ft2-clone-1.66-1.1.aarch64.rpm"
RPM_HASH = "6626e96f8ac50d6f01ab317036e42b828f14300ac0091064cc3ef69c15efd1045e17da1d11d87a9c80cacca55331bf8288741910d0db9b5c7ecd0689e634c350"

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
