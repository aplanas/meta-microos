SUMMARY = "Common Files Used by ISC DHCP Software"
DESCRIPTION = "This package contains common programs used by both the ISC DHCP \
server ('dhcp-server' package) and client ('dhcp-client') as the \
omshell and common manual pages."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-4.4.2.P1-14.3.aarch64.rpm"
RPM_HASH = "96d8ad68838699fbd7f4a198b11eb403dcaa876e69a5461d58bff269a8c6afa8a7d303a5e77fd313f7f6b5800e1fa3107afb3367de4fc904f50889683bb3a550"

RPROVIDES:${PN} += "dhcp \
dhcp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
