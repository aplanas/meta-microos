SUMMARY = "Python support for KDevelop"
DESCRIPTION = "A KDevelop plugin which provides Python language support, including code completion and debugging using PDB."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevelop5-plugin-python3-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "381943018537b61265a01b54a253745066ca828a05201836eb04bfd8da56c4b3a8b5f8e91b55d9361bb18c540cc718479e478aff61c105c9916e851a842b1821"

RPROVIDES:${PN} += "kdevelop4-plugin-python \
kdevelop4-plugin-python3 \
kdevelop5-plugin-python3 \
libkdevpythoncompletion.so \
libkdevpythonduchain.so \
libkdevpythonparser.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevelop5 \
ld-linux-aarch64.so.1 \
libKDevPlatformDebugger.so.512 \
libKDevPlatformInterfaces.so.512 \
libKDevPlatformLanguage.so.512 \
libKDevPlatformOutputView.so.512 \
libKDevPlatformSerialization.so.512 \
libKDevPlatformUtil.so.512 \
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
