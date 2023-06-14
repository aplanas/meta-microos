SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "RealtimeSync executes a command each time it detects changes \
in one of the monitored directories, or when a directory becomes \
available (e.g. insertion of a USB drive). \
This command will usually trigger a FreeFileSync batch job."
LICENSE = "GPL-3.0-or-later"

PV = "12.3"

RPM_NAME = "RealtimeSync-12.3-1.1.aarch64.rpm"
RPM_HASH = "8bf6e316f9d7f4db80939391076386ea6525cb672376fdbeb64d078fbdc411178e3785c40224649e7215e996a1375e93ea5a6c1e80d591c43a72af245443365f"

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
