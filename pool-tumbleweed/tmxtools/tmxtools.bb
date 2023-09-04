SUMMARY = "Commandline Tools for Tiled MapEditor"
DESCRIPTION = "This package contains tmxviewer, a simple application to view Tiled maps \
and tmxrasterizer which is also a command line tool."
LICENSE = "BSD-2-Clause"

PV = "1.10.2"

RPM_NAME = "tmxtools-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "9e5e86334840443f6e1c648d4cd8212228458b0ff19fca4d6d85d8179816816219ad2464eb15a16f7283e97a8d0c7843bbff21e5cdaed1673ffbf82acf186579"

RPROVIDES:${PN} += "tmxtools"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiled.so"

inherit rpm
