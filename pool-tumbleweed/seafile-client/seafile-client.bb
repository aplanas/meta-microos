SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-3.0-only"

PV = "9.0.1"

RPM_NAME = "seafile-client-9.0.1-1.1.aarch64.rpm"
RPM_HASH = "fe4a9ac0bee9f748f0bca0738714e4b597e4074dbbddeee759cfb667470afa45af491399949b11fe4f657fe54b3ed02b3054e4708d79b93fbe15f096a937aa8e"

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
