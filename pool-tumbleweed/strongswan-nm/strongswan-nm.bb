SUMMARY = "NetworkManager plugin for strongSwan"
DESCRIPTION = "StrongSwan is an OpenSource IPsec-based VPN solution for Linux. \
 \
This package provides the NetworkManager plugin to control the \
charon IKEv2 daemon through D-Bus, designed to work using the \
NetworkManager-strongswan graphical user interface."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.11"

RPM_NAME = "strongswan-nm-5.9.11-2.1.aarch64.rpm"
RPM_HASH = "d7e5cbd7a114ace884d19d6845f6c95a2c041d850f982da958fb13c5d12074e47f2e3afac6e7b51f0fb246a756d2040ff2cfe01ee5150e440d9921e6e38e448a"

RPROVIDES:${PN} += "strongswan-nm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcharon.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libstrongswan.so.0 \
strongswan-libs0"

inherit rpm
