SUMMARY = "Plugins for the Single Sign On Framework"
DESCRIPTION = "This package contains the following plugins for the Single Sign On Framework: \
- Password plugin \
- Test plugin"
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-8.60-2.18.aarch64.rpm"
RPM_HASH = "dc43135a8351223f231038a3f434f40d3a95b150d02e850cbf0592b2df285755468204fad992d5d14652f2ce2737144ef684a3fd4dc4fcfff75855e0673e4420"

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
