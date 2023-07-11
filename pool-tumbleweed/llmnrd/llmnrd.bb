SUMMARY = "Link-Local Multicast Resolution (LLMNR) Daemon"
DESCRIPTION = "llmnrd is a daemon implementing the Link-Local Multicast Name Resolution (LLMNR) \
protocol according to RFC 4795. It uses the Netlink kernel interface. \
 \
llmnrd will respond to name resolution queries sent by Windows clients in \
networks where no DNS server is available. It supports both IPv4 and IPv6."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "llmnrd-0.7-4.4.aarch64.rpm"
RPM_HASH = "44a349dc4225b0fffd975265e4ab616c3e5bebe99e4cb6ef1e8c458dc26835a4c4772ae0c4187db4ae9fbd0da850b51188fca82267ff055b0954666b18f3d6ce"

RPROVIDES:${PN} += "config-llmnrd \
llmnrd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
