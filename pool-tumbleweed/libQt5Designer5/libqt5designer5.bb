SUMMARY = "Qt 5 Designer Library"
DESCRIPTION = "The Qt 5 Designer library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libQt5Designer5-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "338d18e1580e352a8177e8d5ef218d2a207c3b41e50b3cca5cb45da1a6b799f084377811c8510455ca9643f29654c79410646e27d0dfbd2462b587057ff04a62"

RPROVIDES:${PN} += "libQt5Designer.so.5 \
libQt5Designer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5Xml.so.5 \
libQt5Xml5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
