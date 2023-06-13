SUMMARY = "Hybrid Lossless Audio Compression Format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
Lossless mode is ideal for archiving audio material or any other situation \
where quality is paramount. The compression ratio depends on the source \
material, but generally is between 30% and 70%. \
 \
The hybrid mode creates both, a relatively small, high-quality lossy file that \
can be used all by itself, and a 'correction' file that (when combined with the \
lossy file) provides full lossless restoration. For some users, this means \
never having to choose between lossless and lossy compression."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "wavpack-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "7ef516403e40ff55e413c3d133e89a8f576d065677341230984be9494789deead6413446d9bccea860693c7abc8a2ff4bfca1269ac735b7f4c27f2cd24ccb860"

RPROVIDES:${PN} += "wavpack \
wavpack(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libwavpack.so.1()(64bit)"

inherit rpm
