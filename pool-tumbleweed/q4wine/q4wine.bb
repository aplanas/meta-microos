SUMMARY = "Qt GUI for WINE"
DESCRIPTION = "Q4Wine is a Qt-based GUI for WINE. It can help manage Wine \
prefixes and installed applications. \
 \
General features: \
- Can export Qt color theme into Wine color settings. \
- Can work with different Wine versions at the same time. \
- Creation, deletion and management of prefixes (WINEPREFIX). \
- Control for Wine process. \
- Autostart icon support. \
- CD image use. \
- Icons can be extracted from PE files (.exe, .dll). \
- Backup and restore for managed prefixes. \
- Wine AppDB browser. \
- Logging subsystem. \
- Winetricks support."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "q4wine-1.3.13-1.17.aarch64.rpm"
RPM_HASH = "6f47036b728e6eda86c70f731ae9cbd35bef080a6a325daf2a24c6cb787677ab5771ef002efbdea403cc4d4243bfba168f0e096458bfbd42dd9654a4159d1d41"

RPROVIDES:${PN} += "libq4wine-core.so \
q4wine"

RDEPENDS:${PN} += "fuseiso \
icoutils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
sudo \
wine"

inherit rpm
