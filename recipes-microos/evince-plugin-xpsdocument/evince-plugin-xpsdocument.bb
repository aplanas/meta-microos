SUMMARY = "XPS document support for Evince"
DESCRIPTION = "A plugin for Evince to read XPS documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-xpsdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "8c8a5ed5c10b273bbc9ba3de81042b719416286b7e89965c6214b90c05768647448be3f004fbaee9422d996b8fea1c16dfc10d4cd45ca27f44221053bac657a0"

RPROVIDES:${PN} += "evince-plugin-xpsdocument evince-plugin-xpsdocument(aarch-64) libxpsdocument.so()(64bit) metainfo() metainfo(evince-xpsdocument.metainfo.xml)"
RDEPENDS:${PN} += "evince ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libevdocument3.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgxps.so.2()(64bit)"

inherit rpm
