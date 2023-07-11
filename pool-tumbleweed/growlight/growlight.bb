SUMMARY = "Disk manipulation and system setup tool"
DESCRIPTION = "growlight can manipulate both physical (NVMe, SATA, etc.) and virtual (mdadm, \
device-mapper, etc.) block devices, help identify bottlenecks in a storage \
topology, create and destroy filesystems, and prepare a machine for initial \
boot when run in an installer context. Both full-screen and REPL readline UIs \
are available."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.38"

RPM_NAME = "growlight-1.2.38-1.7.aarch64.rpm"
RPM_HASH = "29ec608b25f79a6a776e28f60daf2b11117520b688035ed9fb8f6c328986e37d773d4f2a7ee61af84348a40ef0275db52262e0c60990310819a2de7935673c37"

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
