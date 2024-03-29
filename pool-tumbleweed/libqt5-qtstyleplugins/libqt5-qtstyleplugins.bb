SUMMARY = "Qt 5 Style Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains additional style plugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-5.0.0+git20170311-10.12.aarch64.rpm"
RPM_HASH = "f32194e898a98aa225b554202a50fa43b6e3130f44ddb72392c610cbd14b5adb2965934c022983e29a986ed2576071907456de438443a8e010349761863fc437"

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
