SUMMARY = "ANSI Terminal Escape Code Converter - Qt GUI"
DESCRIPTION = "This package provides a Qt Graphical User Interface to run ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.19"

RPM_NAME = "ansifilter-gui-2.19-1.3.aarch64.rpm"
RPM_HASH = "99dccf6908bd0f3ba3e6b518ae8e6cd17fa838c90634c42cdefe30a4b6291b91014f98d47f01a1150d48263275b3e5740ebb140f0cbea5d5a74eefaaf67d3924"

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
