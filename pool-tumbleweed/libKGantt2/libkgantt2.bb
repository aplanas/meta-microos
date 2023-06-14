SUMMARY = "Gantt chart implementation for kdiagram"
DESCRIPTION = "This package contains the KGantt libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libKGantt2-2.8.0-1.14.aarch64.rpm"
RPM_HASH = "9d00ca683859914a17a5a23c459290b0dce3d486497ca7b059cb0447ba508f27a76c5cff49c8201b9e71c835103de83382d8c75e66577286819fe0d707dda57a"

RPROVIDES:${PN} += "libKGantt.so.2 \
libKGantt2 \
libkgantt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
