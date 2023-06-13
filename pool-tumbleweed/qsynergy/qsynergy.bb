SUMMARY = "Qt GUI for easily configuring Synergy2"
DESCRIPTION = "QSynergy is a comprehensive and easy to use graphical front end for Synergy. \
Synergy lets a user control more than one computer with a single mouse and \
keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "qsynergy-1.9.1-4.9.aarch64.rpm"
RPM_HASH = "e018ed5e9f0f0ce4f588dd5f19020c0e9e38dfc4008c48101f6b54b830c23874b2e1c9a624f4c0b0bd14ca47a8ac7c509c08a790fa52d21c8091c88eda5db939"

RPROVIDES:${PN} += "application() \
application(qsynergy.desktop) \
qsynergy \
qsynergy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdns_sd.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
synergy"

inherit rpm
