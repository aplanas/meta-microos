SUMMARY = "Qt5 xmlpatterns examples"
DESCRIPTION = "Examples for the libqt5-qtxmlpatterns module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "759692cb11791a6d3b9c8c38c29039f319a2f4b0f5ea8bae2ce7c6bd14eb4daa43dd1769ca914dbf40fbddc3c03bc487f260f3bda35d3818ca7df6173c5a5fa0"

RPROVIDES:${PN} += "libqt5-qtxmlpatterns-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
