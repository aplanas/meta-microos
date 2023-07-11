SUMMARY = "Commandline Tools for Tiled MapEditor"
DESCRIPTION = "This package contains tmxviewer, a simple application to view Tiled maps \
and tmxrasterizer which is also a command line tool."
LICENSE = "BSD-2-Clause"

PV = "1.10.1"

RPM_NAME = "tmxtools-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "9276f75f1355aa0d5e8d90370e4f59c6aeb43055a0c3a8117c5d549fc134d0737a1d5617dad3080b07edac48087979e89de1b235519ae3017588273f9a0aed50"

RPROVIDES:${PN} += "tmxtools"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiled.so"

inherit rpm
