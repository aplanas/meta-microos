SUMMARY = "Command line client utilities for WS-Management"
DESCRIPTION = "This package provides 'wsman', a CLI utility for resource management \
over the WS-Management protocol. \
 \
Also included is 'wseventmgr', a CLI utility for event management over \
the WS-Management protocol."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "wsmancli-2.6.0-2.20.aarch64.rpm"
RPM_HASH = "181c525b75bdd8832c492cf15c9eba5b8f622032799a5e04492850f07af78737d964293ae18540879a71c26275b71f762f1b4946199078ae6730e16801116104"

RPROVIDES:${PN} += "wsmancli \
wsmancli(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libwsman.so.1()(64bit) \
libwsman_client.so.5()(64bit) \
libwsman_curl_client_transport.so.1()(64bit)"

inherit rpm
