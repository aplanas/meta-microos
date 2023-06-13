SUMMARY = "SELinux policy core policy devel utilities"
DESCRIPTION = "The policycoreutils-devel package contains the management tools use to develop policy in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-devel-3.5-2.1.aarch64.rpm"
RPM_HASH = "1398e3c9c15b7fd168d67bdbe14357b9028b8fa6cd54b674b94facac73df89129199776330aa4773401b5150ac2469f68427d4c36ce0800c001879ecd4b100c8"

RPROVIDES:${PN} += "policycoreutils-devel \
policycoreutils-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/make \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
python3-distro \
python3-policycoreutils"

inherit rpm
