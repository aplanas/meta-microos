SUMMARY = "LinuxSampler Control Protocol Library"
DESCRIPTION = "liblscp is an implementation of the LinuxSampler control protocol, \
proposed as a C language API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.9"

RPM_NAME = "liblscp6-0.9.9-1.1.aarch64.rpm"
RPM_HASH = "c4f24d6d70663dadc367686d6c23016b3d4579d51216419c4275811fb78fbdd4c6a34278cddd6c60a8ecf46bd6a66522bddbab3b1e72d53f0640e5926ae44cc8"

RPROVIDES:${PN} += "liblscp.so.6 \
liblscp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
