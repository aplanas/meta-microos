SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "FreeFileSync is a software that helps synchronizing files \
and folders. It runs backup jobs while having visual \
feedback along the way."
LICENSE = "GPL-3.0-or-later"

PV = "12.3"

RPM_NAME = "FreeFileSync-12.3-1.1.aarch64.rpm"
RPM_HASH = "73f34451b80377af660724c884422a4edc4b80ea7de0285e470e7b59184a33ff55cd670aaa5e71a7e11cc2c4a0fb9abc5afa6c93857fee35ffb5206ac4e3d71f"

RPROVIDES:${PN} += "FreeFileSync \
FreeFileSync(aarch-64) \
application() \
application(FreeFileSync.desktop)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libselinux.so.1()(64bit) \
libssh2.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
