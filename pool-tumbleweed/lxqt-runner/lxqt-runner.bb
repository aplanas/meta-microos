SUMMARY = "LXQt application launcher"
DESCRIPTION = "Tool to launch programs quickly, by typing their names"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-runner-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "7b03dec0780edf9ba7f1c4d0d9c5b394f943dbc54cad6a463db6e8e9505eef42b66bb259eb6a66c81860c72a52f413ed87417025bbe66aea58556b4d980bdaaf"

RPROVIDES:${PN} += "config(lxqt-runner) \
lxqt-runner \
lxqt-runner(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xdg.so.3()(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblxqt-globalkeys-ui.so.1()(64bit) \
liblxqt-globalkeys.so.1()(64bit) \
liblxqt.so.1()(64bit) \
libmuparser.so.2.3.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
