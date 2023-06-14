SUMMARY = "LXQt application launcher"
DESCRIPTION = "Tool to launch programs quickly, by typing their names"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-runner-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "7b03dec0780edf9ba7f1c4d0d9c5b394f943dbc54cad6a463db6e8e9505eef42b66bb259eb6a66c81860c72a52f413ed87417025bbe66aea58556b4d980bdaaf"

RPROVIDES:${PN} += "config-lxqt-runner \
lxqt-runner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xdg.so.3 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblxqt-globalkeys-ui.so.1 \
liblxqt-globalkeys.so.1 \
liblxqt.so.1 \
libmuparser.so.2.3.4 \
libstdc++.so.6"

inherit rpm
