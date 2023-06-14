SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 5 ABI."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "libncurses5-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "276b51db1223aad3e0130ac337f58718d015155963e53353f0071385f36332edfb2a9e3eaf3d3a7003f6f80840656b48a069a9924329b3c90dfa3411ec6f61bc"

RPROVIDES:${PN} += "libform.so.5 \
libformw.so.5 \
libmenu.so.5 \
libmenuw.so.5 \
libncurses++.so.5 \
libncurses++w.so.5 \
libncurses.so.5 \
libncurses5 \
libncursesw.so.5 \
libpanel.so.5 \
libpanelw.so.5 \
libtic.so.5 \
libticw.so.5 \
libtinfo.so.5 \
libtinfow.so.5 \
ncurses"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
terminfo-base"

inherit rpm
