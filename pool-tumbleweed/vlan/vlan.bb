SUMMARY = "802.1q VLAN Implementation for Linux"
DESCRIPTION = "An 802.1q vlan implementation for Linux. See \
http://www.candelatech.com/~greear/vlan.html for more information. \
 \
 \
 \
Authors: \
-------- \
    Ben Greear <greearb@candelatech.com>"
LICENSE = "GPL-2.0-or-later"

PV = "1.9"

RPM_NAME = "vlan-1.9-142.1.aarch64.rpm"
RPM_HASH = "0b2b28f90d33225051c8357aae57ea77b276cf0f8575ee7a373a76fa207ed0308f571fab05f78615bf8a6e7dfb058549a7de7057b692cb5a7e70661fa1f44921"

RPROVIDES:${PN} += "vlan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
