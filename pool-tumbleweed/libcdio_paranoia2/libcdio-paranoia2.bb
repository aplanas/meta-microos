SUMMARY = "Error correction library for CD-DA data blocks"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_paranoia2-10.2+2.0.1-1.9.aarch64.rpm"
RPM_HASH = "ce3b2e0a0f2f39d7f617d37087a277929aad391e5944fac65cddf9209e168c502060ff7075a5d928ef7ee08e823216c444fd2cf15a9f7808a1272c2fc40de51f"

RPROVIDES:${PN} += "libcdio-paranoia.so.2 \
libcdio-paranoia2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio.so.19"

inherit rpm
