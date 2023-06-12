SUMMARY = "Sound Conversion Tools"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "sox-14.4.2-6.1.aarch64.rpm"
RPM_HASH = "34495171c824a47e796f2b3cd7299e0e35668677b8749a24c13ef49072c69ab617632de9b9cc4f4cf875046f80030a0c272d9df62ffa8970365254e70205ccde"

RPROVIDES:${PN} += "sox \
sox(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsox.so.3()(64bit)"

inherit rpm
