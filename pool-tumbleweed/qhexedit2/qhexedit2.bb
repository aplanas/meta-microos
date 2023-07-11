SUMMARY = "Qt-based hex editor"
DESCRIPTION = "QHexEdit is a hex editor widget written in C++ for the Qt framework. \
It is a simple editor for binary data, just like QPlainTextEdit is for text \
data."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "qhexedit2-0.8.9-1.16.aarch64.rpm"
RPM_HASH = "4b5cfe8d7cdbe86fdbac228d81a44fd3cc2fab416867002868de4c133c1fe9042d4dab9109c68e9d2d683bfba8d0f8af1c535a398394487a730fda6964fbcfb8"

RPROVIDES:${PN} += "qhexedit2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
