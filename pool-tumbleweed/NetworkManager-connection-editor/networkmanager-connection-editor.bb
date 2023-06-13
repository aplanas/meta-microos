SUMMARY = "GUI to configure connections for NetworkManager"
DESCRIPTION = "NetworkManager Configuration tool - take control over your \
connection settings."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "NetworkManager-connection-editor-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "49c37a71596db8383a20625fb4d4e4a3e4de5ccf539309ff87e7002879c6d3113da02578de25fd7c11c0dcca5f9ed92e30bdee1df82eb9623bd760ba9750c8d7"

RPROVIDES:${PN} += "NetworkManager-connection-editor \
NetworkManager-connection-editor(aarch-64) \
application() \
application(nm-connection-editor.desktop) \
metainfo() \
metainfo(nm-connection-editor.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_16_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnm.so.0(libnm_1_40_0)(64bit) \
libnm.so.0(libnm_1_4_0)(64bit) \
libnm.so.0(libnm_1_6_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
libnma.so.0(libnma_1_8_28)(64bit) \
libnma.so.0(libnma_1_8_36)(64bit) \
mobile-broadband-provider-info"

inherit rpm
