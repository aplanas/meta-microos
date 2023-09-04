SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 5 ABI."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "libncurses5-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "63cac373b8c8c31607bd6e514d4a94b8dc7aa9e7d1d5db4d86f986fe10076d54460c490d1b7739a4f1a5c2abb27e5866b1a9f7a387108576dd13d769632520e7"

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
