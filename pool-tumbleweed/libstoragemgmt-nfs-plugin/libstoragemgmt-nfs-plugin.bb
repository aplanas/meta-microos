SUMMARY = "Files for nfs support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-nfs-plugin package contains the plugin for nfs based storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-nfs-plugin-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "c4ed6372f504b96139de14e8f9082c5e4f5154f54c23f4623a42b11bc253fe6f7c39967c61c01a014fb2bda1af409ff30c891f30f69e555cefa2bab16cab0e2b"

RPROVIDES:${PN} += "config-libstoragemgmt-nfs-plugin \
libstoragemgmt-nfs-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstoragemgmt \
python-abi \
python3-libstoragemgmt"

inherit rpm
