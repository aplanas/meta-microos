SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 5 ABI."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "libncurses5-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "1290fcb5abe660e4d8fa5348bf6a6d078a3f96d283bb0fedd1420745c4f49137056a676349edaade399f3aa925ea9525c38a4f1ae140452f70ee87c5ea1162e3"

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
