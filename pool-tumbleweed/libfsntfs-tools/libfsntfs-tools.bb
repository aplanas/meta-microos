SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs-tools is a project to access the NTFS filesystem \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs-tools-20230606-1.5.aarch64.rpm"
RPM_HASH = "bdce773a118a2d63b562bcfaae7c2b11763d59b5867985620ab6b7c1ac9f603eb097c9a8b763618b7d26ea078ccb6ee444d1c268075f59ea8d07c620b69a8304"

RPROVIDES:${PN} += "libfsntfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
libfuse.so.2 \
libfusn.so.1 \
libfwnt.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
