SUMMARY = "NetworkManager plugin for ADSL connections"
DESCRIPTION = "NetworkManager plugin for ADSL connections. \
 \
This package is needed to configure PPPoE interfaces"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-pppoe-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "fd2ed27999514a16cb13f085ba952f5db3b84cb13e77246d80e7b504a5cd2c3b8b89e3e74e995d4bdf2e8e78b542b52c6d37e34202e7b59f4309ab6eba2eba7d"

RPROVIDES:${PN} += "NetworkManager-pppoe NetworkManager-pppoe(aarch-64) libnm-device-plugin-adsl.so()(64bit) libnm-ppp-plugin.so()(64bit)"
RDEPENDS:${PN} += "NetworkManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) ppp rp-pppoe"

inherit rpm
