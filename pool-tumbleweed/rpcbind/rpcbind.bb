SUMMARY = "Transport independent RPC portmapper"
DESCRIPTION = "Rpcbind is a replacement for portmap. Whereas portmap supports only UDP \
and TCP transports over INET (IPv4), rpcbind can be configured to work \
on various transports supported by the TI-RPC. This includes TCP and \
UDP over IPv6. Moreover, rpcbind provides additional functions in \
regards to portmap."
LICENSE = "BSD-4-Clause"

PV = "1.2.6"

RPM_NAME = "rpcbind-1.2.6-5.1.aarch64.rpm"
RPM_HASH = "70b157c812a43604be6024b6de30c38a5ea7d03dc4447764efc21d7ad3e2626b6d361590cd7bbc8623c91c80f64b994e06744169e82b58576312258743504936"

RPROVIDES:${PN} += "group(rpc) \
portmap \
rpcbind \
rpcbind(aarch-64) \
user(rpc)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_PRIVATE)(64bit) \
libwrap.so.0()(64bit) \
sysuser-shadow"

inherit rpm
