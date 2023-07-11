SUMMARY = "NFSv4 ID Mapping Library"
DESCRIPTION = "In NFSv4, identities of users are conveyed by names rather than user ID \
and group ID. Both the NFS server and client code in the kernel need to \
translate these to numeric IDs."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "libnfsidmap1-1.0-39.2.aarch64.rpm"
RPM_HASH = "7563280995ab0122077464378fbde660ede292103e6e95f460c08e331d860d20e339201543e765b44026b661368acd6575edaed475dc14a1b5b280b7b7e4e500"

RPROVIDES:${PN} += "libnfsidmap.so.1 \
libnfsidmap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
