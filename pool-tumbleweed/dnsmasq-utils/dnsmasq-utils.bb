SUMMARY = "Utilities for manipulating DHCP server leases"
DESCRIPTION = "Utilities that use the standard DHCP protocol to query/remove a DHCP \
server's leases."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.89"

RPM_NAME = "dnsmasq-utils-2.89-4.1.aarch64.rpm"
RPM_HASH = "408019433c0951374d27cc99a693da7705eda3595caf78d09e76272b702c2aca30b8038d5c70271d81832b49de6f6bc1e5ee28eb5725d14adc9d71b339aff435"

RPROVIDES:${PN} += "dnsmasq-utils \
dnsmasq-utils(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
