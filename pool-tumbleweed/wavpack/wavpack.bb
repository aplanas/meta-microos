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

RPM_NAME = "wavpack-5.6.0-1.4.aarch64.rpm"
RPM_HASH = "6757395ace44b18f56efae57824e07ba9e56c6580094c3e93bea2398b4b98befaaafbe54cf57543c58cbff8859b3356708f04a4b56bf8cd54a4a67a124cffcd8"

RPROVIDES:${PN} += "wavpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwavpack.so.1"

inherit rpm
