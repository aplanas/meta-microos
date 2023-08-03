SUMMARY = "Go replacement for libslirp and VPNKit"
DESCRIPTION = "Go replacement for libslirp and VPNKit \
 \
gvisor-tap-vsock is based on the network stack of gVisor. Compared to libslirp, \
gvisor-tap-vsock brings a configurable DNS server and \
dynamic port forwarding."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "gvisor-tap-vsock-0.6.2-1.1.aarch64.rpm"
RPM_HASH = "bdb407cf69477e72115c977604869ff19da9f07c4e43f7943c70d9aab434238fb38db36e2aa3c3a3a92b6b3e49952491acd8a416e3b5c6b22b287652b1cb6cd0"

RPROVIDES:${PN} += "gvisor-tap-vsock \
gvproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
