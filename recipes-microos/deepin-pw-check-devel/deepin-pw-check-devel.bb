SUMMARY = "Development tools for deepin-pw-check"
DESCRIPTION = "The deepin-pw-check-devel package contains the header files and developer \
docs for deepin-pw-check."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-devel-5.1.16-1.4.aarch64.rpm"
RPM_HASH = "93cdb272b78d29ab85b408b2d264fdab6b3b33e132c87f32e713375b2363141bd1f6a506b4cd678b4c55fe07228a47138cc21dfdc122705f628475c69dc80695"

RPROVIDES:${PN} += "deepin-pw-check-devel deepin-pw-check-devel(aarch-64) libdeepin_pw_check.so.1()(64bit) pkgconfig(libdeepin_pw_check)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrack.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libdeepin_pw_check1 libiniparser.so.1()(64bit)"

inherit rpm
