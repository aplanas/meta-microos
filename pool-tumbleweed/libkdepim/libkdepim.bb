SUMMARY = "Base package of kdepim"
DESCRIPTION = "This package contains the libkdepim library."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkdepim-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "53c51f1b54da97b6ce12533b5a1258f5edade006b25df06e8e295af62953a6802b11e74294c59cae19832e89f6a32cf55195abeca3f4ebb1ad762e7d1da2d331"

RPROVIDES:${PN} += "libkdepim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPim5Libkdepim.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
