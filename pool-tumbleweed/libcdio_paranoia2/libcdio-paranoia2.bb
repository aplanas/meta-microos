SUMMARY = "Error correction library for CD-DA data blocks"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_paranoia2-10.2+2.0.1-1.8.aarch64.rpm"
RPM_HASH = "b3972b136e40ea4a077ce0f74400bc79799b79def32c8ac291ef4a431bc56252e0d3761368fc5e6a574ac08d6faf6f651426c2ac414d148cb10667b3622682f0"

RPROVIDES:${PN} += "libcdio_paranoia.so.2()(64bit) \
libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) \
libcdio_paranoia2 \
libcdio_paranoia2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libcdio_cdda.so.2()(64bit) \
libcdio_cdda.so.2(CDIO_CDDA_2)(64bit)"

inherit rpm
