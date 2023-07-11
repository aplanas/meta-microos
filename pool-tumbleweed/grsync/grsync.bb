SUMMARY = "GUI for rsync"
DESCRIPTION = "Grsync is a GUI (Graphical User Interface) for rsync, the commandline directory \
and file synchronization tool. It can be effectively used to synchronize local \
directories and it supports remote targets as well (even though it doesn't \
support browsing the remote folder). Sample uses of grsync include: synchronize \
a music collection with removable devices, backup personal files to a networked \
drive, replication of a partition to another one, mirroring of files, etc."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "grsync-1.3.0-1.13.aarch64.rpm"
RPM_HASH = "a44b8e16f437c7c753659a57c05d6215090a1c66e625b006db11e42a3f487079e35439cf7e6b27e968fba2f3c1db8614001b107579bd76549e76539ce321f91b"

RPROVIDES:${PN} += "grsync"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
rsync"

inherit rpm
