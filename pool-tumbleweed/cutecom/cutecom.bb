SUMMARY = "A graphical serial terminal"
DESCRIPTION = "CuteCom is a graphical serial terminal, similar to minicom. It is \
written using the Qt library. \
 \
It is aimed mainly at hardware developers or other people who need a \
terminal to talk to their devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.51.0"

RPM_NAME = "cutecom-0.51.0-2.16.aarch64.rpm"
RPM_HASH = "f1f50ae4ec19d2c452f8269733479c331554ba9a861e8cfab0c1773bc9f290f203c36b04f201703f3a2a6a8b40a29968f3e27a232253915dd8eafbfd51e9a45e"

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
