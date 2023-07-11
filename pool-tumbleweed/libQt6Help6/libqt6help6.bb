SUMMARY = "Qt 6 Help library"
DESCRIPTION = "This package contains the Qt 6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Help6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0ebcf553f2200590cedd15a3ad4361517b23b4a553fa8ae1129cecc1811b4ec87799d1b6f246f753173a076e70b2002199ff4fbcaf2714bc7524f4bcb6effb04"

RPROVIDES:${PN} += "libQt6Help.so.6 \
libQt6Help6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
