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
config(strongswan-ipsec) \
ipsec \
libstrongswan-drbg.so()(64bit) \
libstrongswan-stroke.so()(64bit) \
libstrongswan-updown.so()(64bit) \
strongswan \
strongswan-ipsec \
strongswan-ipsec(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcharon.so.0()(64bit) \
libpttls.so.0()(64bit) \
libstrongswan-kernel-netlink.so()(64bit) \
libstrongswan.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtls.so.0()(64bit) \
libtnccs.so.0()(64bit) \
libtpmtss.so.0()(64bit) \
libvici.so.0()(64bit) \
strongswan-libs0"

inherit rpm
