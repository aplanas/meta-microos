SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "RealtimeSync executes a command each time it detects changes \
in one of the monitored directories, or when a directory becomes \
available (e.g. insertion of a USB drive). \
This command will usually trigger a FreeFileSync batch job."
LICENSE = "GPL-3.0-or-later"

PV = "12.4"

RPM_NAME = "RealtimeSync-12.4-1.1.aarch64.rpm"
RPM_HASH = "b0e1e09329a95cb797c5396c69a5e149e9493d7da8159535ccbc32c439f70b07e06d7845d5d48f761126be4c8885c50ad5f81f820f59097d4131141286cf7734"

RPROVIDES:${PN} += "RealtimeSync"

RDEPENDS:${PN} += "FreeFileSync \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-richtext-suse.so.9.0.0"

inherit rpm
