SUMMARY = "Plugins for the Single Sign On Framework"
DESCRIPTION = "This package contains the following plugins for the Single Sign On Framework: \
- Password plugin \
- Test plugin"
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signon-plugins-8.61-1.1.aarch64.rpm"
RPM_HASH = "917faec5066b50f3c56fd00e6124f4fe2e0d505934d9ffa80e71b417635c3da738c3d4110fb6bd52ecfd60562468ce283f94e6089f73202de8c4afdc5cd96434"

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
