SUMMARY = "NTFS Support in Userspace -- Development Files"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "LGPL-2.1-or-later"

PV = "2022.10.3"

RPM_NAME = "libntfs-3g-devel-2022.10.3-2.5.aarch64.rpm"
RPM_HASH = "28c66a36171205bfc748dfd044d4cec267ca90d6118d49ca5d4667c113e2b43fb154f084d54666bba71fb30c92e20f0207dd8d51bb7bc4677b4ccd25cbdf82d7"

RPROVIDES:${PN} += "libntfs-3g-devel \
ntfs-3g-devel \
pkgconfig-libntfs-3g"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libntfs-3g89"

inherit rpm
