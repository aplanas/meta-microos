SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 6 ABI."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "libncurses6-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "816c88cabcd3f61a77b633df2a0f10fe31c208b4f40e1322c7f9b5308a59a48d31e2aa0e0aa8f3a95b2af4b1dfc104f6095cf31afb0a0733c85f8d82aac9c188"

RPROVIDES:${PN} += "libform.so.6 \
libformw.so.6 \
libmenu.so.6 \
libmenuw.so.6 \
libncurses++.so.6 \
libncurses++w.so.6 \
libncurses.so.6 \
libncurses6 \
libncursesw.so.6 \
libpanel.so.6 \
libpanelw.so.6 \
libtic.so.6 \
libticw.so.6 \
libtinfo.so.6 \
libtinfow.so.6 \
ncurses"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
terminfo-base"

inherit rpm
