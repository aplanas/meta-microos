SUMMARY = "Transparent Inter Process Communication Protocol"
DESCRIPTION = "TIPC utilities (tipcutils) is a set of userspace programs used to \
configure and manage TIPC (http://tipc.sourceforge.net/). \
 \
The Transparent Inter Process Communication protocol allows \
applications in a clustered computer environment to communicate quickly \
and reliably with other applications, regardless of their location \
within the cluster."
LICENSE = "BSD-3-Clause"

PV = "3.0.6"

RPM_NAME = "tipcutils-3.0.6-1.2.aarch64.rpm"
RPM_HASH = "fab3c4a2fa41f2f48a5451cea2f49384b92201a00aff5cf5f616ad2274170b7a1368fbf858fa6330c2aaca11cab962c842207e2299ceb680f4fd129f188d3a5a"

RPROVIDES:${PN} += "tipcutils \
tipcutils(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdaemon.so.0()(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
