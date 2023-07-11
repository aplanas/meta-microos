SUMMARY = "Common Files Used by ISC DHCP Software"
DESCRIPTION = "This package contains common programs used by both the ISC DHCP \
server ('dhcp-server' package) and client ('dhcp-client') as the \
omshell and common manual pages."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-4.4.2.P1-14.4.aarch64.rpm"
RPM_HASH = "280ecf79b2d321c8e7673183615e07723834455aad87e12e3a7bf7b9a41f94fcfa7a2ebe4ed1211a7ad4251aa8094f2c1be20995429ff6f90bb7c4ca7da20c37"

RPROVIDES:${PN} += "dhcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
