SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 6 ABI."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "libncurses6-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "7c520577399c1c443e563f0b9862ea4b38258184a565e7dc08e73fa50c49ceb1ce5d2930b4e6e4a18a968d3f2709d5cf7bebca6b31641e620437a620d25195ef"

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
