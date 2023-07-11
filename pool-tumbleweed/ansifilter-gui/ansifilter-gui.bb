SUMMARY = "ANSI Terminal Escape Code Converter - Qt GUI"
DESCRIPTION = "This package provides a Qt Graphical User Interface to run ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.20"

RPM_NAME = "ansifilter-gui-2.20-1.1.aarch64.rpm"
RPM_HASH = "c51e099cdcc94fbda0859379e71d95ee8ad6d8abf926572bf756b5517babea809ee55437d0bd50dd30f800c6afe1dd9fd8b765c220ee60ffc6de9f0b94fa973a"

RPROVIDES:${PN} += "ansifilter-gui"

RDEPENDS:${PN} += "ansifilter \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
