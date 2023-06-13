SUMMARY = "CD-DA reading library"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio_cdda2-10.2+2.0.1-1.8.aarch64.rpm"
RPM_HASH = "bd9f9fbc4e71c23d05a4867d3fab57e59c3b34724091aa98ca0c63f3fb3ab82a63ecd2002bf0079b969ca7a6cdf9173339348d5a23f46db506ec538d358ef737"

RPROVIDES:${PN} += "libcdio_cdda.so.2()(64bit) \
libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) \
libcdio_cdda2 \
libcdio_cdda2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libm.so.6()(64bit)"

inherit rpm
