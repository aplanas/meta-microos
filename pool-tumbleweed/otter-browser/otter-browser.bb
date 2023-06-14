SUMMARY = "Web browser with aspects of Opera"
DESCRIPTION = "Otter Browser is a web browser that recreates some aspects of \
the classic Opera web browser (version 12.x) using the Qt framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.03"

RPM_NAME = "otter-browser-1.0.03-1.7.aarch64.rpm"
RPM_HASH = "da065af52c6be3d4095687fc0a0ccc3784a4d3b9f80ffd9e57a75af0aa3143b49bc0c0ae8b0d75430b942a1c5877040ec2b679c13e4cf95eb6574f02b319bf0b"

RPROVIDES:${PN} += "otter-browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
