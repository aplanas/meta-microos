SUMMARY = "Disk manipulation and system setup tool"
DESCRIPTION = "growlight can manipulate both physical (NVMe, SATA, etc.) and virtual (mdadm, \
device-mapper, etc.) block devices, help identify bottlenecks in a storage \
topology, create and destroy filesystems, and prepare a machine for initial \
boot when run in an installer context. Both full-screen and REPL readline UIs \
are available."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.38"

RPM_NAME = "growlight-1.2.38-1.8.aarch64.rpm"
RPM_HASH = "f6d83bbc0b3a4c76b008a6a6b3cb442afbd505a395ce089a7ff3f2f6b7b9ed5c9bd6d8d91c98614ae8534010a488e578c4075ce70ba7da20b2898d1932aa3136"

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
