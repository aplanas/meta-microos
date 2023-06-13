SUMMARY = "A weather visualization package"
DESCRIPTION = "XyGrib is a weather visualization package that interacts with \
OpenGribs's Grib server providing a choice of global and large area \
atmospheric and wave models. \
 \
XyGrib also uses pre-cut Gribs of high-resolution regional models \
found on OpenSkiron.org."
LICENSE = "GPL-3.0-only"

PV = "1.2.6.1"

RPM_NAME = "XyGrib-1.2.6.1-7.3.aarch64.rpm"
RPM_HASH = "b2c1a7b6958dbe161a3df6a200ecb0c74270a844dba3e6deb48aebabc9dc1e46203ae40bb5e555f0486121b9b9a11c3a01fecc963dd04f4db01891e770633be0"

RPROVIDES:${PN} += "XyGrib \
XyGrib(aarch-64) \
application() \
application(XyGrib.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libnova-0.15.so.0()(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libproj.so.25()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
