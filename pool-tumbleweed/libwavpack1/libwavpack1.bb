SUMMARY = "Hybrid Lossless Audio Compression Format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
Lossless mode is ideal for archiving audio material or any other situation \
where quality is paramount. The compression ratio depends on the source \
material, but generally is between 30% and 70%."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "libwavpack1-5.6.0-1.4.aarch64.rpm"
RPM_HASH = "137a52df94778ee761d1ece4a61544a4fa883ecff0b3fc67a5e87ce46ed75be831b23b6f152ffec24610ccf058c09e88a09d4b89b328f3a91ffe9487a3b4ce75"

RPROVIDES:${PN} += "libwavpack.so.1 \
libwavpack1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
