SUMMARY = "Screenshot tool"
DESCRIPTION = "Ksnip is a Qt based cross-platform screenshot tool that provides many \
annotation features for your screenshots."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "ksnip-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "b186921b0ac60f2535a75f9f3d51c84be8b7770655699f9bbc8b9f111dd3db124877868d601e89f3f82b70e8fb6fdf436ab057795315e65cdaeedb6e27683248"

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
