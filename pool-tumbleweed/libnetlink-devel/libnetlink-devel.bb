SUMMARY = "A Higher Level Interface to the Netlink Service"
DESCRIPTION = "libnetlink provides a higher-level interface to rtnetlink(7). \
New programs should use libmnl-devel instead."
LICENSE = "GPL-2.0-or-later"

PV = "6.4"

RPM_NAME = "libnetlink-devel-6.4-1.1.aarch64.rpm"
RPM_HASH = "c184813c1cc2b34fd728384e09ffe698df7489c5eaee81cb1a32ac504b12feb3be59b43adde855e74d3e6d48eb18f5ae7bcc194b9e23c8504e23714c71e4dbf2"

RPROVIDES:${PN} += "libnetlink \
libnetlink-devel"

RDEPENDS:${PN} += ""

inherit rpm
