SUMMARY = "QTerm is BBS client"
DESCRIPTION = "QTerm is a full featured BBS client written in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "qterm-0.7.4-1.13.aarch64.rpm"
RPM_HASH = "7e52af4c1d43e7ce35ade17ad4eb67d0c8317c62eea142d37e4441830f5c2cd2be2406512b0e3eb5be157c884597d5bc8592d6d3ed0ffabe40d47b36583ca20b"

RPROVIDES:${PN} += "qterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
