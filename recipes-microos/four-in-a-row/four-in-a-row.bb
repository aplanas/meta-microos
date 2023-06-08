SUMMARY = "Connect Four Game for GNOME"
DESCRIPTION = "The object of Four-in-a-Row is to place four pieces in a vertical, \
horizontal, or diagonal row while the opponent tries to block and make \
his/her own row of four. Four-in-a-Row can be played against another \
human or the computer."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "four-in-a-row-3.38.1-1.14.aarch64.rpm"
RPM_HASH = "f54fa1e4265561b87d48cd0a7ddc97882cebadf1d05969922694690fc5689a3dacee453d44262dce36ab5675d12f47138552d0defc0ac0c9e7a8a14dd6114080"

RPROVIDES:${PN} += "application() application(org.gnome.Four-in-a-row.desktop) four-in-a-row four-in-a-row(aarch-64) metainfo() metainfo(org.gnome.Four-in-a-row.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsound.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
