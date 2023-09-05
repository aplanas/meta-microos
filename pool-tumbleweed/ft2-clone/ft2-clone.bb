SUMMARY = "Fasttracker II clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
Fasttracker II. It can load XM, MOD, S3M, STM module files."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.69"

RPM_NAME = "ft2-clone-1.69-1.1.aarch64.rpm"
RPM_HASH = "0b6d436b6040a1bdf81fd4f44f6e9ea5bbd49188748ee9d721af829241474c003a59310f020f2ad4dbff91871b50372dc8edb3d298776b8b4700f473f079469b"

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
