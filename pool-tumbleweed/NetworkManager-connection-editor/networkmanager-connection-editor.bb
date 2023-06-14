SUMMARY = "GUI to configure connections for NetworkManager"
DESCRIPTION = "NetworkManager Configuration tool - take control over your \
connection settings."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "NetworkManager-connection-editor-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "49c37a71596db8383a20625fb4d4e4a3e4de5ccf539309ff87e7002879c6d3113da02578de25fd7c11c0dcca5f9ed92e30bdee1df82eb9623bd760ba9750c8d7"

RPROVIDES:${PN} += "NetworkManager-connection-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjansson.so.4 \
libnm.so.0 \
libnma.so.0 \
mobile-broadband-provider-info"

inherit rpm
