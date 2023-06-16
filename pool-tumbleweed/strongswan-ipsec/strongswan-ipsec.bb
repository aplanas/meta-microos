SUMMARY = "IPsec-based VPN solution"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the /etc/init.d/ipsec service script and allows \
to maintain both IKEv1 and IKEv2 using the /etc/ipsec.conf and the \
/etc/ipsec.secrets files."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-ipsec-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "33a9fba47de5170b92f21a9dea99ecff833c1dd8f474522d0a243bf6c96fdd14329bf0d226807f7e3822d671cc6c87338e935a18098de61197db09631c13581f"

RPROVIDES:${PN} += "VPN \
config-strongswan-ipsec \
ipsec \
libstrongswan-drbg.so \
libstrongswan-stroke.so \
libstrongswan-updown.so \
strongswan \
strongswan-ipsec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcharon.so.0 \
libpttls.so.0 \
libstrongswan-kernel-netlink.so \
libstrongswan.so.0 \
libsystemd.so.0 \
libtls.so.0 \
libtnccs.so.0 \
libtpmtss.so.0 \
libvici.so.0 \
strongswan-libs0"

inherit rpm
