SUMMARY = "NetworkManager plugin for strongSwan"
DESCRIPTION = "StrongSwan is an OpenSource IPsec-based VPN solution for Linux. \
 \
This package provides the NetworkManager plugin to control the \
charon IKEv2 daemon through D-Bus, designed to work using the \
NetworkManager-strongswan graphical user interface."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-nm-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "20f3f694746d48fb432fda39446e452720ac9f2fb640eff541926ee67f8970e62112c984de91d6094d8039be2c5ef82f8e20997d42ab3a07b7445b39bf3208a3"

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
