SUMMARY = "FAT Filesystem Sorting Utility"
DESCRIPTION = "FATsort sorts directory structures of FAT filesystems. Many MP3 hardware \
players don't sort files automatically but play them in the order they were \
transmitted to the device. FATSort can help here."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.5.640"

RPM_NAME = "fatsort-1.6.5.640-1.4.aarch64.rpm"
RPM_HASH = "906c124c58f8fccb0fbaf80e379c7c4ac71e8aed9b85de27937d443313adc18b3e981496c5961db948e9afed3c3a98e3eb695409d534062e29c986b224674a9f"

RPROVIDES:${PN} += "fatsort"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
