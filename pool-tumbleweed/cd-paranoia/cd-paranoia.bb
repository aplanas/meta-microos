SUMMARY = "CDDA reader"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "cd-paranoia-10.2+2.0.1-1.9.aarch64.rpm"
RPM_HASH = "d6bfc9472d3ff21771348ec6ad974ed739677421519cfb0e90f23f2eadbcdaf5ee330ad51ba18f8512d4e48bb40240b437e3e94ba299c74e2b13cb1d17e573f9"

RPROVIDES:${PN} += "cd-paranoia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libm.so.6"

inherit rpm
