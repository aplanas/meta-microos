SUMMARY = "Development tools for deepin-pw-check"
DESCRIPTION = "The deepin-pw-check-devel package contains the header files and developer \
docs for deepin-pw-check."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-devel-5.1.16-1.5.aarch64.rpm"
RPM_HASH = "cf07d528c04a9d375df0f455efb835cd20e3b0adc5ea6d0416b37830c42f7858386b383d41a0980523d1ab4f9702176a263e2fd07101959c1b4704b4e885572d"

RPROVIDES:${PN} += "deepin-pw-check-devel \
deepin-pw-check-devel(aarch-64) \
libdeepin_pw_check.so.1()(64bit) \
pkgconfig(libdeepin_pw_check)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrack.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libdeepin_pw_check1 \
libiniparser.so.1()(64bit)"

inherit rpm
