SUMMARY = "MikMod Sound Library"
DESCRIPTION = "Libmikmod is a portable sound library, capable of playing samples as \
well as module files. It was originally written by Jean-Paul Mikkers \
(MikMak) for DOS. It supports OSS /dev/dsp, ALSA, and Esound and can \
also write wav files. Supported file formats include mod, stm, s3m, \
mtm, xm, and it."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.11.1"

RPM_NAME = "libmikmod3-3.3.11.1-1.16.aarch64.rpm"
RPM_HASH = "a5adaf1c3075fe72afdfa345c05b9dfb0f5febecdbe4babef6eff5969f83e6889479ebe0953481c8455961f695b6846eee468dbd530077dcf0efb2ab3287efa6"

RPROVIDES:${PN} += "libmikmod.so.3 \
libmikmod3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpulse-simple.so.0"

inherit rpm
