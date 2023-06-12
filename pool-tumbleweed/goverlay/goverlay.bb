SUMMARY = "Graphical UI to help manage overlays"
DESCRIPTION = "GOverlay is a graphical UI to manage Vulkan/OpenGL overlays."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "goverlay-0.9.1-1.3.aarch64.rpm"
RPM_HASH = "ee803fd768aa6bd231ab416eb8c1f077b099b532240f15ed1f605c3e699d239d8d56902025b438c7c541e2877d477abd205547624b2bd23276113ddeb24032cb"

RPROVIDES:${PN} += "application() \
application(io.github.benjamimgois.goverlay.desktop) \
goverlay \
goverlay(aarch-64) \
metainfo() \
metainfo(io.github.benjamimgois.goverlay.metainfo.xml)"
RDEPENDS:${PN} += "/bin/sh \
Mesa-demo \
libQt5Pas.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
mangohud \
replay-sorcery \
vkbasalt \
vulkan-tools"

inherit rpm