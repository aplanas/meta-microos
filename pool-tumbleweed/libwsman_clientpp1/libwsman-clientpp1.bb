SUMMARY = "C++ bindings to the OpenWSMAN client library"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides a C++ API library for OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_clientpp1-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "8defb1e64cade99b3ef3715ed50b8dbf6fcd45127c6cdd42ae056ed91b34331f86cc98887cca67d0d6d5600bf8fb06961e9507f9bc3cc7eab63a084f240269db"

RPROVIDES:${PN} += "libwsman-clientpp.so.1 \
libwsman-clientpp1 \
openwsman-client"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
