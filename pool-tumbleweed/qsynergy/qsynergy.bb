SUMMARY = "Qt GUI for easily configuring Synergy2"
DESCRIPTION = "QSynergy is a comprehensive and easy to use graphical front end for Synergy. \
Synergy lets a user control more than one computer with a single mouse and \
keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "qsynergy-1.9.1-4.10.aarch64.rpm"
RPM_HASH = "9fe847dac0d145eabd676f3ca8dfeaec53d4fc2bd395377b30a0fd9b03cc9a3632f619e4608baf8601fe9ad2d448806f53bf18888dc6d52ebad121690572933f"

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
