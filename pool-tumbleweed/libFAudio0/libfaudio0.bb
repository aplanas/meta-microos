SUMMARY = "A reimplementation of the XNA Game Studio libraries"
DESCRIPTION = "FNA is a reimplementation of the Microsoft XNA Game Studio 4.0 Refresh libraries."
LICENSE = "Zlib"

PV = "23.07"

RPM_NAME = "libFAudio0-23.07-1.1.aarch64.rpm"
RPM_HASH = "98620ae99d3d6cd43a346875e5c598e6ad9d1794d584fab6b5e254ef56b33d619bce305e006334214d2bd762589acf56dc0018f206999871733339d63958f0cb"

RPROVIDES:${PN} += "libFAudio.so.0 \
libFAudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
