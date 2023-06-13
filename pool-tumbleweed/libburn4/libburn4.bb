SUMMARY = "Library for Writing Preformatted Data onto Optical Media"
DESCRIPTION = "Libburn is a library for writing preformatted data onto optical media such as \
CD, DVD, BD (Blu-Ray) and also offers a facility for reading data blocks from \
its drives without using the normal block device I/O."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "libburn4-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "9fd6435c8b22f2a00174b253a5a0f00d9c9577f0cd498ee756c369a654ae7f227105e2f5d79d89e493f343b8cf558717a70844637cf858fcb4d7adc974d9c563"

RPROVIDES:${PN} += "libburn.so.4()(64bit) \
libburn.so.4(LIBBURN4)(64bit) \
libburn4 \
libburn4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
