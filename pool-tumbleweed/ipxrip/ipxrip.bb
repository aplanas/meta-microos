SUMMARY = "IPX Routing Daemon"
DESCRIPTION = "This is an RIP/SAP daemon for Linux. With this daemon, you can turn \
your Linux machine into an IPX router."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ipxrip-0.7-1016.28.aarch64.rpm"
RPM_HASH = "cfe54ee9b857934815d234b75961eb974b8c29d9ffbd024aedb4de4c1e7983c4e86e46e8f7aa2254150e05e706d1febb50e4f96055cf92fd18be955803b014d5"

RPROVIDES:${PN} += "config-ipxrip \
ipxrip \
ipxripd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
