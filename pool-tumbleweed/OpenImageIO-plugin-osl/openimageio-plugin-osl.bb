SUMMARY = "OpenImageIO input plugin"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This is a plugin to access OSL from OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenImageIO-plugin-osl-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "c3179a57c8274c39bc05add209dab3f103ad8a52993f2151d15645562a1facbb5af41951ca02803f42f1707a19f920b02e0f288952390e56c68865683d6b0a5b"

RPROVIDES:${PN} += "OpenImageIO-plugin-osl \
OpenImageIO-plugin-osl(aarch-64) \
osl.imageio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liboslexec.so.1.12()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
