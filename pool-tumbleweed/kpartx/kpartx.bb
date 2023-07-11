SUMMARY = "Manages partition tables on device-mapper devices"
DESCRIPTION = "The kpartx program maps linear devmaps to device partitions, which \
makes multipath maps partionable."
LICENSE = "GPL-2.0-only"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "kpartx-0.9.5+68+suse.d1b6a1c-1.2.aarch64.rpm"
RPM_HASH = "8312c424cdcc49aa033afefd384af6456b62597259603521858e0ad4adb1e33305d8617d0576c79000ba75635b8626964e4484081c7a9cacfa428a7f75fd5fbc"

RPROVIDES:${PN} += "kpartx"

RDEPENDS:${PN} += "/usr/bin/sh \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
