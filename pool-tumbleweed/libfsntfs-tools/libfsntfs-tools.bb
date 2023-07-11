SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs-tools is a project to access the NTFS filesystem \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs-tools-20230606-1.4.aarch64.rpm"
RPM_HASH = "a6edfad7935d021c740ebbf4abc1a091327908ffe0b044e7a5312e9bd448eb167cbeffeca3f91625b9e7de8fc96143d9f67a82c86eaf23642567ed5877c39918"

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
