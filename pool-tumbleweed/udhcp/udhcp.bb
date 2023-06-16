SUMMARY = "Micro DHCP client / server"
DESCRIPTION = "Udhcp is a small dhcp client / server mainly used to support Xen \
para-virtualized PXE booting."
LICENSE = "GPL-2.0-only"

PV = "0.9.8"

RPM_NAME = "udhcp-0.9.8-29.2.aarch64.rpm"
RPM_HASH = "277d88acf6d92077580c3830d94bbb8643f720496fa2931e0de00fc92a2c7d5581884437467da9efc962b323cc292c96700282f366acde87f8c43b2f3f9c80af"

RPROVIDES:${PN} += "udhcp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
