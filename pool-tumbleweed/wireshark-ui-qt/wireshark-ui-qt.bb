SUMMARY = "A Network Traffic Analyser - Qt UI"
DESCRIPTION = "This package contains the Qt based UI for Wireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "wireshark-ui-qt-4.0.7-1.1.aarch64.rpm"
RPM_HASH = "42b12de55051e75054922c9a825bab8861a96f635dc17cb00df640247934e82069afd78291871d45f77c30bd6663f9fd2344f2ed4c5ee390f081e7515e2e5e37"

RPROVIDES:${PN} += "wireshark-ui \
wireshark-ui-gtk \
wireshark-ui-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libminizip.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libpcap.so.1 \
libpcre2-8.so.0 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libwireshark.so.16 \
libwiretap.so.13 \
libwsutil.so.14 \
libz.so.1 \
wireshark \
xdg-utils"

inherit rpm
