SUMMARY = "Gaming input devices library - libgaminggearwidget"
DESCRIPTION = "A shared library initiated by the Roccat Linux driver project. \
 \
This package holds libgaminggearwidget."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggearwidget0-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "498a2827ddf34193e7cc4983b0a7fdf6d7d93edebfe94908d8208810a79ea4f0a60c6a78dda17073f73644ecefd781ae114f7a072f4c88cf15f1480b42ba6963"

RPROVIDES:${PN} += "libgaminggearwidget.so.0 \
libgaminggearwidget0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgaminggear.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
