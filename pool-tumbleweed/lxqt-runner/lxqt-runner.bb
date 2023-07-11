SUMMARY = "LXQt application launcher"
DESCRIPTION = "Tool to launch programs quickly, by typing their names"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-runner-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "cddd02630678c57d50e3c75a1b835a1af2299303286a5aa212279e6a2c97ac47c3e2ba0055f54ad0556d3e3e380bfb42093c89f44df04529825b4468b37e7953"

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
