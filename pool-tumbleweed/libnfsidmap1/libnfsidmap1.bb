SUMMARY = "NFSv4 ID Mapping Library"
DESCRIPTION = "In NFSv4, identities of users are conveyed by names rather than user ID \
and group ID. Both the NFS server and client code in the kernel need to \
translate these to numeric IDs."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "libnfsidmap1-1.0-39.1.aarch64.rpm"
RPM_HASH = "e9cbd42b24196aa9206433a04f9137737afd2bfea605616f2de0f7a3e82afbc9f07916b2a65ffb855b53c09be14159ca21500b10c3e539b65e2fe958cc7dac43"

RPROVIDES:${PN} += "libnfsidmap.so.1()(64bit) \
libnfsidmap1 \
libnfsidmap1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
