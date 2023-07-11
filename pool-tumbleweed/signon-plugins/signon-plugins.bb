SUMMARY = "Plugins for the Single Sign On Framework"
DESCRIPTION = "This package contains the following plugins for the Single Sign On Framework: \
- Password plugin \
- Test plugin"
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-8.60-2.19.aarch64.rpm"
RPM_HASH = "407075f95e2e3d7750d8b63043cad00ae0111e1d6ad2d998f4a5f739daf81420ef724f05b6d9245b2063adb9033f424eb303d3a3b2287e0aff36f749c04d9e1c"

RPROVIDES:${PN} += "libexampleplugin.so \
libpasswordplugin.so \
libsignon-plugins.so.1 \
libssotest2plugin.so \
libssotestplugin.so \
signon-plugins"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
signond"

inherit rpm
