SUMMARY = "Client for Cisco AnyConnect VPN"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, such as: \
 \
* Cisco's 'AnyConnect' VPN (HTTPS/DTLS) supported by the ASA5500 Series, \
  by IOS 12.4(9)T or later on Cisco SR500, 870, 880, 1800, 2800, 3800, \
  7200 Series and Cisco 7301 Routers, and probably others. \
* Array Networks AG SSL VPN \
* Juniper SSL VPN \
* Pulse Connect Secure \
* Palo Alto Networks GlobalProtect SSL VPN \
* F5 Big-IP SSL VPN \
* Fortinet Fortigate SSL VPN"
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "openconnect-9.12-1.1.aarch64.rpm"
RPM_HASH = "0a69f1844ff3a5d917d8bbed06c34d23e537ab484853be1fc35264c3d3d8cd8fabcbefbd010de7435cba6a5e343e9a637085f3093de1f9e2cd61ff3471ec6414"

RPROVIDES:${PN} += "config(openconnect) \
openconnect \
openconnect(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libopenconnect.so.5()(64bit) \
libopenconnect.so.5(OPENCONNECT_5_1)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_2)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_3)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_4)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_5)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_6)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_7)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_9)(64bit) \
libopenconnect.so.5(OPENCONNECT_PRIVATE)(64bit) \
libproxy.so.1()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
