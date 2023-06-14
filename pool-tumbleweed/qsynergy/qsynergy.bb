SUMMARY = "Qt GUI for easily configuring Synergy2"
DESCRIPTION = "QSynergy is a comprehensive and easy to use graphical front end for Synergy. \
Synergy lets a user control more than one computer with a single mouse and \
keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "qsynergy-1.9.1-4.9.aarch64.rpm"
RPM_HASH = "e018ed5e9f0f0ce4f588dd5f19020c0e9e38dfc4008c48101f6b54b830c23874b2e1c9a624f4c0b0bd14ca47a8ac7c509c08a790fa52d21c8091c88eda5db939"

RPROVIDES:${PN} += "qsynergy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdns-sd.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
synergy"

inherit rpm
