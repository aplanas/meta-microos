SUMMARY = "Utilities for manipulating DHCP server leases"
DESCRIPTION = "Utilities that use the standard DHCP protocol to query/remove a DHCP \
server's leases."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.89"

RPM_NAME = "dnsmasq-utils-2.89-4.2.aarch64.rpm"
RPM_HASH = "2aac3eb817d15e235219b4d8494a94cccf89860e5fadf911e7158fe6118689d0f2e0f76f7adfcc25e105b6236433ae311938b82ba8f380d6c1dfd3249743f57f"

RPROVIDES:${PN} += "dnsmasq-utils"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
