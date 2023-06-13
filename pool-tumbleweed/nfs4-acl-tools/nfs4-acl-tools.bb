SUMMARY = "Command line tools for managing ACLs over NFSv4"
DESCRIPTION = "Command line tools for viewing and setting ACLs (Access Control Lists) \
when using NFSv4 to access a remote filesystem. The remote filesystem \
must also support ACLs."
LICENSE = "BSD-3-Clause"

PV = "0.3.7"

RPM_NAME = "nfs4-acl-tools-0.3.7-2.6.aarch64.rpm"
RPM_HASH = "dc2d5d8db576c3ba4c751f553717a64c49d61882fdf867736ffe8dfacada0aa5e5c2c95b989e1d93edc2382c92ad9bcf3c5ffe945ea3bc49bad27b3ebe76b260"

RPROVIDES:${PN} += "nfs4-acl-tools \
nfs4-acl-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
