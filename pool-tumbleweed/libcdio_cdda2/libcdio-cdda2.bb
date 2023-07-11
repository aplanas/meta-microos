SUMMARY = "CD-DA reading library"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_cdda2-10.2+2.0.1-1.9.aarch64.rpm"
RPM_HASH = "8d608efc78a2505de17ceeb05a46636943c43d3d10288e252cff0491c652d1719959421626a4d26d04ddb6edf1ce3168332137de69834baaa3fc726f2258e40a"

RPROVIDES:${PN} += "libcdio-cdda.so.2 \
libcdio-cdda2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libm.so.6"

inherit rpm
