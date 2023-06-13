SUMMARY = "MikMod Sound Library"
DESCRIPTION = "Libmikmod is a portable sound library, capable of playing samples as \
well as module files. It was originally written by Jean-Paul Mikkers \
(MikMak) for DOS. It supports OSS /dev/dsp, ALSA, and Esound and can \
also write wav files. Supported file formats include mod, stm, s3m, \
mtm, xm, and it."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.11.1"

RPM_NAME = "libmikmod3-3.3.11.1-1.15.aarch64.rpm"
RPM_HASH = "5687ae1797aa61d1778f28955d2d6458ce299da12943bcca829e1e7c8ca17e4eb999f8e7ecf1f2792fc32b1e23f0331a801f43f103b538515030c811d1ad9494"

RPROVIDES:${PN} += "libmikmod.so.3()(64bit) \
libmikmod3 \
libmikmod3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit)"

inherit rpm
