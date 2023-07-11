SUMMARY = "Screenshot tool"
DESCRIPTION = "Ksnip is a Qt based cross-platform screenshot tool that provides many \
annotation features for your screenshots."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "ksnip-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "791df5d6fccfa09685ba84d1e9c7666eca5b09b8797cfdf64012ecdfc779ed8107de3e1481d207434d2809cdd95d52a0a9861e5304e01456e5661b43d60de864"

RPROVIDES:${PN} += "ksnip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkImageAnnotator.so.0 \
libstdc++.so.6 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
