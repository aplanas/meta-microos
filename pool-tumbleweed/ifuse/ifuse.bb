SUMMARY = "Filesystem access for Apple devices"
DESCRIPTION = "iFuse is a FUSE filesystem driver which uses `libimobiledevice` to connect to \
devices without the need for a jailbreak. \
It is using the native Apple 'AFC' protocol, over the normal USB cable in order \
to access the iPhone's, iPod Touch's or iPad's media files under Linux."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "ifuse-1.1.4-1.11.aarch64.rpm"
RPM_HASH = "0ee6c47e9709b03a84f65ee672efebc4bd7446e2814b67a108135f1e6500e5beae6014d2090237129e703aac4d05bd48ba3f846f4dbd3aad72edbf90f571fa57"

RPROVIDES:${PN} += "ifuse"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4"

inherit rpm
