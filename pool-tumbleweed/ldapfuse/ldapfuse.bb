SUMMARY = "Browse LDAP trees via filesystem"
DESCRIPTION = "A virtual filesystem for FUSE that allows to navigate an LDAP tree. \
 \
Author: \
------- \
	Jan Engelhardt"
LICENSE = "GPL-3.0"

PV = "1.0"

RPM_NAME = "ldapfuse-1.0-11.34.aarch64.rpm"
RPM_HASH = "429d64956aaaf44ceb62da956ee9f584214e4196c1e0fa533afeb03def20cc05f91c27c9298bbbb41736bd3da9551521fb8ada81feb03fa677240e9b0c5a451a"

RPROVIDES:${PN} += "ldapfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libfuse.so.2 \
liblber.so.2 \
libldap.so.2"

inherit rpm
