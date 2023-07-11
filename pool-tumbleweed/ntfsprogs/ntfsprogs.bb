SUMMARY = "NTFS Utilities"
DESCRIPTION = "The ntfsprogs includes utilities for doing all required tasks to NTFS \
partitions. In general, just run a utility without any command line \
options to display the version number and usage syntax."
LICENSE = "GPL-2.0-or-later"

PV = "2022.10.3"

RPM_NAME = "ntfsprogs-2022.10.3-2.5.aarch64.rpm"
RPM_HASH = "d2ddba8280a1cd96da4c13b8ad7979a4402dd4fed57a8175980f7359475f993fbd73311c792b55a90ba823ce5df79d708b2f242de52fd185893bc709742bbdf0"

RPROVIDES:${PN} += "ntfsprogs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libntfs-3g.so.89 \
libuuid.so.1"

inherit rpm
