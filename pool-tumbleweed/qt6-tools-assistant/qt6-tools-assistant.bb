SUMMARY = "Documentation browser"
DESCRIPTION = "Qt Assistant is a tool for viewing documentation in Qt help file format."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-assistant-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d7b942af3932e0e5739a99875cff8dbe118fa6c40db5b8d0bf3c69c9fa3fa44f3a4191515a8157cab7abb3456b80b4d7b0aafa3977f1eb857fd0f5cb9a88949a"

RPROVIDES:${PN} += "qt6-tools-assistant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
