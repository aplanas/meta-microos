SUMMARY = "GUI to configure connections for NetworkManager"
DESCRIPTION = "NetworkManager Configuration tool - take control over your \
connection settings."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "NetworkManager-connection-editor-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "903f6a3dc9fb26dec6e66737553abc4992da70f9ad5a125b6f2a42309605ce300ebd28e24ab15d62b589d7c10ddc30a9cb57228250be4a56c489863b9d752a14"

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
