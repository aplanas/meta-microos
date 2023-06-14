SUMMARY = "Text grammar checking"
DESCRIPTION = "This package provides a library for automated grammar checking."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libKF5TextGrammarCheck1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "a69c47ed4bdfeb79441336f4cdf8bbb058a061592f957c6551c17ce71a844e8e15f286ed65b44d3790e1cd8a15c19b1ebcfbafba08b232ba2e1769b724f8e48c"

RPROVIDES:${PN} += "libKF5TextGrammarCheck.so.1 \
libKF5TextGrammarCheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ktextaddons \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
