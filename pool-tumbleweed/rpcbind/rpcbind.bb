SUMMARY = "Transport independent RPC portmapper"
DESCRIPTION = "Rpcbind is a replacement for portmap. Whereas portmap supports only UDP \
and TCP transports over INET (IPv4), rpcbind can be configured to work \
on various transports supported by the TI-RPC. This includes TCP and \
UDP over IPv6. Moreover, rpcbind provides additional functions in \
regards to portmap."
LICENSE = "BSD-4-Clause"

PV = "1.2.6"

RPM_NAME = "rpcbind-1.2.6-5.2.aarch64.rpm"
RPM_HASH = "78a3654187248d486c9f97b2f6a04afb2f3cca6f29c29f74015939eda31427ada7f6ea56bb2ccfe7b86f408aedb55c7fdd28aadab5e30108465296b4c4f2ef8f"

RPROVIDES:${PN} += "group-rpc \
portmap \
rpcbind \
user-rpc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libtirpc.so.3 \
libwrap.so.0 \
sysuser-shadow"

inherit rpm
