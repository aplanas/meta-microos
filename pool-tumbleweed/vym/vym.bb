SUMMARY = "Tool to generate and manipulate thought maps"
DESCRIPTION = "VYM (View Your Mind) is a tool to generate and manipulate maps which \
show thoughts. Such maps can help improve creativity and effectivity. \
They can be used for time management, to organize tasks, to get an \
overview over complex contexts, to sort ideas etc."
LICENSE = "GPL-2.0-only"

PV = "2.9.2"

RPM_NAME = "vym-2.9.2-1.2.aarch64.rpm"
RPM_HASH = "c6be53b78154be0036e022ceead75e987ed9d686d3db787f85514dc8e8697e484c734f5518e33dad6a1c387953d3d66ba269212cc0ccffc88410e5e477a6a9a6"

RPROVIDES:${PN} += "vym"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Script.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
unzip \
zip"

inherit rpm
