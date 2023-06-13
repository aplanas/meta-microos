SUMMARY = "Gaming input devices library - libgaminggearwidget"
DESCRIPTION = "A shared library initiated by the Roccat Linux driver project. \
 \
This package holds libgaminggearwidget."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggearwidget0-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "498a2827ddf34193e7cc4983b0a7fdf6d7d93edebfe94908d8208810a79ea4f0a60c6a78dda17073f73644ecefd781ae114f7a072f4c88cf15f1480b42ba6963"

RPROVIDES:${PN} += "libgaminggearwidget.so.0()(64bit) \
libgaminggearwidget0 \
libgaminggearwidget0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgaminggear.so.0()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
