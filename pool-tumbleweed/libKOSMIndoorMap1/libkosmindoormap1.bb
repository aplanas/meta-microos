SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "OSM multi-floor indoor map renderer library."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "libKOSMIndoorMap1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "38f5507822dec49dc5a3b30940979c8d5dbe5213e23125a109fed0a4b65090484c7ed6ff42090d5a75b212a96ed6de4551ef76455b5e77c54530aefc5ea32a2b"

RPROVIDES:${PN} += "libKOSMIndoorMap.so.1()(64bit) \
libKOSMIndoorMap1 \
libKOSMIndoorMap1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKOSM.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
