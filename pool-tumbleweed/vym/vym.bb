SUMMARY = "Tool to generate and manipulate thought maps"
DESCRIPTION = "VYM (View Your Mind) is a tool to generate and manipulate maps which \
show thoughts. Such maps can help improve creativity and effectivity. \
They can be used for time management, to organize tasks, to get an \
overview over complex contexts, to sort ideas etc."
LICENSE = "GPL-2.0-only"

PV = "2.9.2"

RPM_NAME = "vym-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "4b3845adfbd89a18f1ccaf4e9f5d2e53e480313e7a5f6249d72aa4f0d14e0df95ce8de84b3cbbe8caf836801a1472b6a7a4ca302db79b725b56e7fd5f44cb4d6"

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
