SUMMARY = "Example programs using Qwt(Qt6)"
DESCRIPTION = "This package contains example programs demonstrating the Qwt(Qt6) widgets."
LICENSE = "SUSE-QWT-1.0 | BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-examples-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "246fcc3d5f4f8a2849c0b6ed42dfb588d37f219e5e37986ece773eb24abd1868076e36b43f8309a15e1eb1e0ff4547bb8f542a2490337e80fe2a517788a241c5"

RPROVIDES:${PN} += "qwt6-qt6-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqwt-qt6.so.6.2 \
libstdc++.so.6 \
qwt6-qt6-devel"

inherit rpm
