SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-openconnect-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "c1a517a0f3159d4d2757a8d6c68d65aac0dcb09a188d03e2e914cbbd4e4dde499af2d126457fc3c86c67a4fa0898fdf2fbba54e0de61988724fee96521f64449"

RPROVIDES:${PN} += "NetworkManager-openconnect NetworkManager-openconnect(aarch-64) group(nm-openconnect) libnm-vpn-plugin-openconnect.so()(64bit) user(nm-openconnect)"
RDEPENDS:${PN} += "/bin/sh NetworkManager NetworkManager-openconnect-frontend ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libopenconnect.so.5()(64bit) libopenconnect.so.5(OPENCONNECT_5_5)(64bit) openconnect sysuser-shadow"

inherit rpm
