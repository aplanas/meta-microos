SUMMARY = "IPsec-based VPN solution"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the /etc/init.d/ipsec service script and allows \
to maintain both IKEv1 and IKEv2 using the /etc/ipsec.conf and the \
/etc/ipsec.secrets files."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.11"

RPM_NAME = "strongswan-ipsec-5.9.11-2.1.aarch64.rpm"
RPM_HASH = "1c7b56c7b8c7c9d4023af825d8fa8a6b3c9f696128700d1805ad44b1b35a4e21175e5f22bdc68738db3d9e5b70ee0804432cdb6d57953dc59f5722ba54aae8d9"

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
