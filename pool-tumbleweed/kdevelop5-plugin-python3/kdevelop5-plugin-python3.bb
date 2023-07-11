SUMMARY = "Python support for KDevelop"
DESCRIPTION = "A KDevelop plugin which provides Python language support, including code completion and debugging using PDB."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdevelop5-plugin-python3-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "770c7594347aebef8d29abe0a25878c78d4bda1dc06e0249cc0c1edfaeeb43b6274acca313ac47f805aa20c0b61cda643dddee62e7088136de0287c401717417"

RPROVIDES:${PN} += "kdevelop4-plugin-python \
kdevelop4-plugin-python3 \
kdevelop5-plugin-python3 \
libkdevpythoncompletion.so \
libkdevpythonduchain.so \
libkdevpythonparser.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevelop5 \
ld-linux-aarch64.so.1 \
libKDevPlatformDebugger.so.511 \
libKDevPlatformInterfaces.so.511 \
libKDevPlatformLanguage.so.511 \
libKDevPlatformOutputView.so.511 \
libKDevPlatformSerialization.so.511 \
libKDevPlatformUtil.so.511 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Parts.so.5 \
libKF5TextEditor.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6"

inherit rpm
