SUMMARY = "Graphical Interface for highlight"
DESCRIPTION = "This package provides graphical interface for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-gui-4.7-1.1.aarch64.rpm"
RPM_HASH = "14bf59f04e71b00a1e283cefcff25ddb70fcdc07e3f9a8f4953958242c7960be799617fc59fdb9d0314c8563afe344f1f11d124f24f30cccfc4122d49d38cb12"

RPROVIDES:${PN} += "highlight-gui"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
