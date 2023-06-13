SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 6 ABI."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "libncurses6-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "e9295f97c0174be22d4e2b58bf962d34e8ff29feef3385a9d549ddb85e213a0f481819d5cabfcfe866b575013df1fb3581217d0d1b4766e81dc04bd5fcc945d3"

RPROVIDES:${PN} += "libform.so.6()(64bit) \
libformw.so.6()(64bit) \
libmenu.so.6()(64bit) \
libmenuw.so.6()(64bit) \
libncurses++.so.6()(64bit) \
libncurses++w.so.6()(64bit) \
libncurses.so.6()(64bit) \
libncurses6 \
libncurses6(aarch-64) \
libncursesw.so.6()(64bit) \
libpanel.so.6()(64bit) \
libpanelw.so.6()(64bit) \
libtic.so.6()(64bit) \
libticw.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libtinfow.so.6()(64bit) \
ncurses"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
terminfo-base"

inherit rpm
