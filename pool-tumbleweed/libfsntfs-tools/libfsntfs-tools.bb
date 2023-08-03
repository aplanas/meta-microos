SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs-tools is a project to access the NTFS filesystem \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs-tools-20230606-2.1.aarch64.rpm"
RPM_HASH = "ffead96414b5df293d145810577cb9633bf3b8bdad5dc54a260c0964e04e19d9194a3fdd9e4d18044bd4fbc3c35c28465553ba34f429eee4a1979486e5d2d053"

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
