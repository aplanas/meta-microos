SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 5 ABI."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "libncurses5-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "182581fa94f4eaacd7bc3144399d5b8ec0d97c08ea56cb47c5d320ea9f79ad95eae33c3c17f620212f74c171f4b261f23550055b5286b2ebb502f742c2794507"

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
