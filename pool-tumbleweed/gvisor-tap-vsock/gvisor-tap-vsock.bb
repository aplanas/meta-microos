SUMMARY = "Go replacement for libslirp and VPNKit"
DESCRIPTION = "Go replacement for libslirp and VPNKit \
 \
gvisor-tap-vsock is based on the network stack of gVisor. Compared to libslirp, \
gvisor-tap-vsock brings a configurable DNS server and \
dynamic port forwarding."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "gvisor-tap-vsock-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "04f5f945bf62b6e75af78266e1e85f5545258c8af071b680f68a7a7d58827866c2aa67a8e32b95cff77e98b6a455d4d60de3391e609a92cf91f449add1280c98"

RPROVIDES:${PN} += "gvisor-tap-vsock \
gvproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
