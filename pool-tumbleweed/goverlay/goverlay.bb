SUMMARY = "Graphical UI to help manage overlays"
DESCRIPTION = "GOverlay is a graphical UI to manage Vulkan/OpenGL overlays."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "goverlay-0.9.1-1.4.aarch64.rpm"
RPM_HASH = "dc3df7e6eb686ee6ae5178271c678828ec444f72b45c56487ab30e07d719406b520fa47d67087a7c16f9af70b92c021df79697c0a246297a7ecb510704383b05"

RPROVIDES:${PN} += "goverlay"

RDEPENDS:${PN} += "/usr/bin/sh \
Mesa-demo \
libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6 \
mangohud \
replay-sorcery \
vkbasalt \
vulkan-tools"

inherit rpm
