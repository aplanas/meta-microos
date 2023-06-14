SUMMARY = "Disk manipulation and system setup tool"
DESCRIPTION = "growlight can manipulate both physical (NVMe, SATA, etc.) and virtual (mdadm, \
device-mapper, etc.) block devices, help identify bottlenecks in a storage \
topology, create and destroy filesystems, and prepare a machine for initial \
boot when run in an installer context. Both full-screen and REPL readline UIs \
are available."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.38"

RPM_NAME = "growlight-1.2.38-1.5.aarch64.rpm"
RPM_HASH = "0908abaca38181037235bbd36317ef216d5bbc5b4c59847f9d04b502323c5b9fdf937cb397f51b9a588138a3da42c8f22bdf8919f3902b072492cc3f9ac52720"

RPROVIDES:${PN} += "growlight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libcryptsetup.so.12 \
libdevmapper.so.1.03 \
libnettle.so.8 \
libnotcurses-core.so.3 \
libnotcurses.so.3 \
libpci.so.3 \
libpciaccess.so.0 \
libudev.so.1 \
libz.so.1"

inherit rpm
