SUMMARY = "Error correction library for CD-DA data blocks"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_paranoia2-10.2+2.0.1-1.8.aarch64.rpm"
RPM_HASH = "b3972b136e40ea4a077ce0f74400bc79799b79def32c8ac291ef4a431bc56252e0d3761368fc5e6a574ac08d6faf6f651426c2ac414d148cb10667b3622682f0"

RPROVIDES:${PN} += "libcdio-paranoia.so.2 \
libcdio-paranoia2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio.so.19"

inherit rpm
