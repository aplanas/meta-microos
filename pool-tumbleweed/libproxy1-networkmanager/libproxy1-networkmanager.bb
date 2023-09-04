SUMMARY = "Libproxy module for NetworkManager configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query NetworkManager \
about network configuration changes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-networkmanager-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "663ea3e77a27536da5b1661196af14fd3caec8c320f83610f7e16ba349f09447fb07be5fa17b51d74384c8e0bf513c3880b783432eb2d2cccf949265438d3c23"

RPROVIDES:${PN} += "libproxy1-networkmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libproxy1 \
libstdc++.so.6"

inherit rpm
