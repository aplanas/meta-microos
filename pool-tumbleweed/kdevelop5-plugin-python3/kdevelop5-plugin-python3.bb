SUMMARY = "Python support for KDevelop"
DESCRIPTION = "A KDevelop plugin which provides Python language support, including code completion and debugging using PDB."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevelop5-plugin-python3-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "190edd5f991e26637ec0d667134037485d49a2354193729e887d56f2a42c898306cda504ddb6561aca9539c8f2099c3d0d4849eb924c46ea85f38bf37f321d88"

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
libpython3.10.so.1.0 \
libstdc++.so.6"

inherit rpm
