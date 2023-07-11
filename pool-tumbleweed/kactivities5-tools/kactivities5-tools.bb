SUMMARY = "Command-line tools for Plasma Activity management"
DESCRIPTION = "This package provides command-line tools to manipulate Plasma Activities."
LICENSE = "GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kactivities5-tools-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d3b1a2eac3182c33f7a097bf7741462321cb0aa13248e33876e47eadc1249623722f3caaa84b8472c81bccd48512d293dc94c43fe5ddadac33ce6d52b1e42765"

RPROVIDES:${PN} += "kactivities5-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Activities5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
