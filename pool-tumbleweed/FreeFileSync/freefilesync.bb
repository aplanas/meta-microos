SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "FreeFileSync is a software that helps synchronizing files \
and folders. It runs backup jobs while having visual \
feedback along the way."
LICENSE = "GPL-3.0-or-later"

PV = "12.3"

RPM_NAME = "FreeFileSync-12.3-1.1.aarch64.rpm"
RPM_HASH = "73f34451b80377af660724c884422a4edc4b80ea7de0285e470e7b59184a33ff55cd670aaa5e71a7e11cc2c4a0fb9abc5afa6c93857fee35ffb5206ac4e3d71f"

RPROVIDES:${PN} += "FreeFileSync"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libselinux.so.1 \
libssh2.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-richtext-suse.so.9.0.0 \
libz.so.1"

inherit rpm
