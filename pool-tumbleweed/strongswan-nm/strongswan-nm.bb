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

RPROVIDES:${PN} += "strongswan-nm \
strongswan-nm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcharon.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libstrongswan.so.0()(64bit) \
strongswan-libs0"

inherit rpm
