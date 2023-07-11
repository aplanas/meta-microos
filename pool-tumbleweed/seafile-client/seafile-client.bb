SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-3.0-only"

PV = "9.0.3"

RPM_NAME = "seafile-client-9.0.3-1.1.aarch64.rpm"
RPM_HASH = "ab56eb5e199626f716d68756ac4435b973117037437b3a9ef393b19eb3173bd8022693c59dd3663a583d7ce50a5cf2da4c7f69cd12ea89794cbd83a5f72fa6a2"

RPROVIDES:${PN} += "seafile-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libseafile.so.0 \
libsearpc.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
python3-pysearpc \
seafile"

inherit rpm
