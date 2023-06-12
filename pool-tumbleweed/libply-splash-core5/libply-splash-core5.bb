SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-splash-core library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-core5-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "b9a974c3b0c78c11f67f172099e026f4f455832edbaa20d4549464f40c4edc009feed42aed06b7ccd720f92fa3f51fb868af27b9442bccf4736dc9cedf35dae1"

RPROVIDES:${PN} += "libply-splash-core.so.5()(64bit) \
libply-splash-core5 \
libply-splash-core5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libply.so.5()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
