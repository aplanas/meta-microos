SUMMARY = "Hybrid Lossless Audio Compression Format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
Lossless mode is ideal for archiving audio material or any other situation \
where quality is paramount. The compression ratio depends on the source \
material, but generally is between 30% and 70%."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "libwavpack1-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "33d6682a0552698287b3d6643b9ac21c34ff9d8c3d9d916694d2ecb961beca2d2b54bb5ba8aa240d569efc20e79e9561104d387c9082d87c578f4a6926bf35ee"

RPROVIDES:${PN} += "libwavpack.so.1 \
libwavpack1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
