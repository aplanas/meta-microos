SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library and tools."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7df29b935816329ddfe47696576ce25b461acfd7cdd2c63281abb52f9eab9c5b9432817c991eaa81d8f84297c8e343b337ffa6f56ab64b3c6dbc8e87cb941265"

RPROVIDES:${PN} += "qt6-shadertools \
qt6-shadertools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6ShaderTools.so.6()(64bit) \
libQt6ShaderTools.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
spirv-tools"

inherit rpm
