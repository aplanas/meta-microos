SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-openconnect-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "c1a517a0f3159d4d2757a8d6c68d65aac0dcb09a188d03e2e914cbbd4e4dde499af2d126457fc3c86c67a4fa0898fdf2fbba54e0de61988724fee96521f64449"

RPROVIDES:${PN} += "NetworkManager-openconnect \
group-nm-openconnect \
libnm-vpn-plugin-openconnect.so \
user-nm-openconnect"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
NetworkManager-openconnect-frontend \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libopenconnect.so.5 \
openconnect \
sysuser-shadow"

inherit rpm
