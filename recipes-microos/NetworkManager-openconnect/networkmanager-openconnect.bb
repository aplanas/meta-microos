SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "NetworkManager-openconnect-1.2.8-2.3.aarch64.rpm"
RPM_HASH = "2731c8704c18654635ca9042c737ed6be33641d578879ce020fb165dcc1e5888ea2fc42f052874a158c46346abc80bbc93d1dd7e6632c302cc6d6f43ae52e5c5"

RPROVIDES:${PN} += "NetworkManager-openconnect NetworkManager-openconnect(aarch-64) group(nm-openconnect) libnm-vpn-plugin-openconnect.so()(64bit) user(nm-openconnect)"
RDEPENDS:${PN} += "/bin/sh NetworkManager NetworkManager-openconnect-frontend ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libopenconnect.so.5()(64bit) libopenconnect.so.5(OPENCONNECT_5_5)(64bit) openconnect sysuser-shadow"

inherit rpm
