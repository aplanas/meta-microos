SUMMARY = "A Network Traffic Analyser - Qt UI"
DESCRIPTION = "This package contains the Qt based UI for Wireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "wireshark-ui-qt-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "385698366a3d3a3d7bbe03fa51715462a9090129cf2ffb651416a5b122361540e8b73da901eb2ffa9ffdeb65ddb8b72707351b4e9d796a1b548282329a17e59f"

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
