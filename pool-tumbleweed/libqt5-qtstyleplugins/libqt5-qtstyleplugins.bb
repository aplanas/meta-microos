SUMMARY = "Qt 5 Style Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains additional style plugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-5.0.0+git20170311-10.11.aarch64.rpm"
RPM_HASH = "3668e5d52bd859f8ff136dcc85e3ac7fc6c6cd0a32a004c0e139d0fe116105568efde5a52f2ff094f1422bd115ee32a5056f57c559a8d432a0ed6463462ca330"

RPROVIDES:${PN} += "libbb10styleplugin.so \
libqcleanlooksstyle.so \
libqmotifstyle.so \
libqplastiquestyle.so \
libqt5-qtstyleplugins"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
