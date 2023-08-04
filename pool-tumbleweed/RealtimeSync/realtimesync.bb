SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "RealtimeSync executes a command each time it detects changes \
in one of the monitored directories, or when a directory becomes \
available (e.g. insertion of a USB drive). \
This command will usually trigger a FreeFileSync batch job."
LICENSE = "GPL-3.0-or-later"

PV = "12.5"

RPM_NAME = "RealtimeSync-12.5-1.1.aarch64.rpm"
RPM_HASH = "1312b4a61d63d3ffad904c6b1491696516ffefa6436a4c21b2ce9ac0db31aa5e94bc2c2b8532ceca2a708bbc531b53c0ea9ef2e2da5ee1d48961d682495b5471"

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
