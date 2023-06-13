SUMMARY = "NTFS Support in Userspace -- Development Files"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "LGPL-2.1-or-later"

PV = "2022.10.3"

RPM_NAME = "libntfs-3g-devel-2022.10.3-2.3.aarch64.rpm"
RPM_HASH = "8474687d856390320c2cb78b7d6d94ce0a38a9a9e81bf98e3f8a2ffdb50bb1a5b3493dfafa642e264a01f03260fa5b7a466d6c8d65e01d30e753ea86c07b0da9"

RPROVIDES:${PN} += "libntfs-3g-devel \
libntfs-3g-devel(aarch-64) \
ntfs-3g-devel \
pkgconfig(libntfs-3g)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libntfs-3g89"

inherit rpm
