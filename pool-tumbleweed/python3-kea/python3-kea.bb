SUMMARY = "Python interface to Kea DHCP server"
DESCRIPTION = "Python3 interface to ISC Kea DHCP server."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "python3-kea-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "37b43636418adf403e49590f5c365c61408b622bd730cd403c0c31604bc7e9dc1822e16b3086693e903f348669fa4ef47e3070160cb858380042f82f029d62ec"

RPROVIDES:${PN} += "python3-kea"

RDEPENDS:${PN} += "python-abi"

inherit rpm
