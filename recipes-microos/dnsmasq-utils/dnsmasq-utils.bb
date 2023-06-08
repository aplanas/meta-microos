SUMMARY = "Utilities for manipulating DHCP server leases"
DESCRIPTION = "Utilities that use the standard DHCP protocol to query/remove a DHCP \
server's leases."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.89"

RPM_NAME = "dnsmasq-utils-2.89-3.1.aarch64.rpm"
RPM_HASH = "da1250ad59ad0b719e1315125ae57a6037725171cad88ff0bb9126d15753d05140f20e23cd4593e70f5236b8d7dc4331a7af6a105c72a70dbcdc01ea478d691b"

RPROVIDES:${PN} += "dnsmasq-utils dnsmasq-utils(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
