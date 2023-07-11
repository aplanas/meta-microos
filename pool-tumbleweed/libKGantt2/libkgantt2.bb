SUMMARY = "Gantt chart implementation for kdiagram"
DESCRIPTION = "This package contains the KGantt libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libKGantt2-2.8.0-1.15.aarch64.rpm"
RPM_HASH = "6829ce6ccf3dd337a1929a527d9e8a86094d844067def6b5d256bbd015bedbed8c69c2f82e4bb5ffd22460e2d938bd525b8893d4bfa52a6186690beefbdeef26"

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
