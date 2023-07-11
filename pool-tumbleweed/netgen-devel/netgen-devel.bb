SUMMARY = "Development files for netgen"
DESCRIPTION = "Development files for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-devel-6.2.2301-1.5.aarch64.rpm"
RPM_HASH = "4b0ab6fab44b97b9b4fb8ff712ebfdb62450bfa0a7df92059ab96313774352d41d63d80b10af4800be20e5ce33ec79a3dc3fa45b67ee665ac903ff90375dc51e"

RPROVIDES:${PN} += "cmake-Netgen \
netgen-devel"

RDEPENDS:${PN} += "netgen \
netgen-libs \
occt-devel"

inherit rpm
