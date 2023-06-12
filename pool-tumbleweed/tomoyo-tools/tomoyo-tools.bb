SUMMARY = "Userspace tools for TOMOYO Linux 2.4.x"
DESCRIPTION = "This package contains userspace tools for administrating TOMOYO Linux 2.4. \
Please see http://tomoyo.sourceforge.jp/2.4/ for documentation."
LICENSE = "GPL-2.0-only"

PV = "2.6.1.20210910"

RPM_NAME = "tomoyo-tools-2.6.1.20210910-1.8.aarch64.rpm"
RPM_HASH = "33e8df35f030b9fceb83a9ee2c285327f62e472db904f40b2676fa8d5ae5e1c27a5538aa687dfe3dac279f47360b54d477663cc78e5a4394e58316b06c9b8892"

RPROVIDES:${PN} += "libtomoyotools.so.3()(64bit) \
tomoyo-tools \
tomoyo-tools(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
