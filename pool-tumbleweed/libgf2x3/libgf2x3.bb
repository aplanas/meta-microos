SUMMARY = "Library for multiplication over the GF(2) field"
DESCRIPTION = "gf2x is a library for multiplication of polynomials over the \
GF(2) binary field."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libgf2x3-1.3.0-2.10.aarch64.rpm"
RPM_HASH = "d54f52186dce994600f2bd74ead477203be030fc779b24bdbffba974846ed0d409e33d7cc86487487f93ca1a0807b50cc1bcbd2b842f1751f53d0701e70756f6"

RPROVIDES:${PN} += "libgf2x-fft.so.3 \
libgf2x.so.3 \
libgf2x3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
