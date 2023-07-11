SUMMARY = "A screenshot tool"
DESCRIPTION = "This is a default screenshot app for Linux Deepin."
LICENSE = "LGPL-2.1+"

PV = "0.0.5"

RPM_NAME = "deepin-turbo-0.0.5-2.10.aarch64.rpm"
RPM_HASH = "e8fbf5a0f11a9f3827488925476a2182f680927c30c404269ae49c244855738caeb48b624a6f9855baaf0236c18cced815a8d0d7870d71758e4092fe2b353a46"

RPROVIDES:${PN} += "deepin-turbo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdbus-1.so.3 \
libdeepin-turbo.so.0 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
