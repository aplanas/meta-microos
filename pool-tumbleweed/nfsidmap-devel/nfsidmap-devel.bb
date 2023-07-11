SUMMARY = "NFSv4 ID Mapping Library development libraries"
DESCRIPTION = "In NFSv4, identities of users are conveyed by names rather than user ID \
and group ID. Both the NFS server and client code in the kernel need to \
translate these to numeric IDs."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "nfsidmap-devel-1.0-39.2.aarch64.rpm"
RPM_HASH = "2b9a200ca20e8cb5afc49404904a8c6faae550e614fb8859bd38ae193dd87c9291bab118d8cb57c1f671b8cf03d52c18b776e67f90648e65057db56a4e599da4"

RPROVIDES:${PN} += "nfsidmap-devel \
pkgconfig-libnfsidmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfsidmap1"

inherit rpm
