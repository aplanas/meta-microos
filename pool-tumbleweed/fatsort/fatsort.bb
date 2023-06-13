SUMMARY = "FAT Filesystem Sorting Utility"
DESCRIPTION = "FATsort sorts directory structures of FAT filesystems. Many MP3 hardware \
players don't sort files automatically but play them in the order they were \
transmitted to the device. FATSort can help here."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.5.640"

RPM_NAME = "fatsort-1.6.5.640-1.3.aarch64.rpm"
RPM_HASH = "ee0a3f069ad973777b28810569d88beeb989da7c601f18d420ed449b6e637b59895c6523ca6455d20dba87905615ce2a312a4d175328faa1b491a4d73a1293fa"

RPROVIDES:${PN} += "fatsort \
fatsort(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
