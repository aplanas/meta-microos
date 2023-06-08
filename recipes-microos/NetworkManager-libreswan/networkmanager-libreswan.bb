SUMMARY = "Libreswan VPN client plugin for NetworkManager"
DESCRIPTION = "This package contains software for integrating the libreswan VPN \
software with NetworkManager and the GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16"

RPM_NAME = "NetworkManager-libreswan-1.2.16-2.3.aarch64.rpm"
RPM_HASH = "130dda81cb2e7ed0e3b3b906e6d902774a6f34a62188d9ebd67a263d3756931e1e691919cdb233dd56f69d486c600d3dc941090e0dc1e8d43ab6ba5f8b853b72"

RPROVIDES:${PN} += "NetworkManager-libreswan NetworkManager-libreswan(aarch-64) NetworkManager-openswan libnm-vpn-plugin-libreswan.so()(64bit)"
RDEPENDS:${PN} += "/usr/sbin/ipsec ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit)"

inherit rpm
