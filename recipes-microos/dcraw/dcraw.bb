SUMMARY = "Raw Digital Photo Decoding"
DESCRIPTION = "Command line tools for raw digital photo decoding and processing."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-9.28.0-2.7.aarch64.rpm"
RPM_HASH = "768faa3967a4056e11a2a958dbdcae52cd443b5805a90e614dd4a2344bd7f9578d1bb3cc3e159adb3ff24b4e3a467bf3ef215275b558dc6850f83ef5a3d2d791"

RPROVIDES:${PN} += "dcraw dcraw(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjasper.so.7()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
