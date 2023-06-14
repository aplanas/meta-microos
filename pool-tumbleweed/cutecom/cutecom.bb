SUMMARY = "A graphical serial terminal"
DESCRIPTION = "CuteCom is a graphical serial terminal, similar to minicom. It is \
written using the Qt library. \
 \
It is aimed mainly at hardware developers or other people who need a \
terminal to talk to their devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.51.0"

RPM_NAME = "cutecom-0.51.0-2.15.aarch64.rpm"
RPM_HASH = "827f8613b2139be7dd1016b40a5d098518689a714ba9e353e4d4b0274392fa08ade2c93a474dd560f501f2b6a74208bafefd84f85860d4b29ac20aa0536b843e"

RPROVIDES:${PN} += "cutecom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
