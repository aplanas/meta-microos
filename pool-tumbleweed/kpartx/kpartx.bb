SUMMARY = "Manages partition tables on device-mapper devices"
DESCRIPTION = "The kpartx program maps linear devmaps to device partitions, which \
makes multipath maps partionable."
LICENSE = "GPL-2.0-only"

PV = "0.9.6+71+suse.f07325e"

RPM_NAME = "kpartx-0.9.6+71+suse.f07325e-1.1.aarch64.rpm"
RPM_HASH = "76f846d2144c71a803ffcfbe58c65d0ca47a54baa1d6b18c3d69e9d17480219380f83ed98baadc8bfddb08dbdee794705a1d138fa8291f5a1801b5fc9c40af6a"

RPROVIDES:${PN} += "kpartx"

RDEPENDS:${PN} += "/usr/bin/sh \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
