SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows the preview image for an image URL."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-imagepreviewplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "e5bef62cfa8bd257b665e679587bef7602c22d18f4f48b43cd9aab6ddfeebf134f4dafe9d6f8118174f6fec39c008df4877677bff0fad43e13118d3d4b1d5ec1"

RPROVIDES:${PN} += "libimagepreviewplugin.so()(64bit) \
psi+-plugins-imagepreviewplugin \
psi+-plugins-imagepreviewplugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
psi+"

inherit rpm
