SUMMARY = "PoPToP - PPTP Daemon, Linux as Microsoft VPN Server"
DESCRIPTION = "PoPToP is a PPTP(Point-to-Point Tunneling Protocol) server solution for \
Linux, it allows Linux servers to function seamlessly in the PPTP VPN \
environment. This release supports Windows 95/98/NT/2000 PPTP clients \
and PPTP Linux clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "pptpd-1.4.0-4.4.aarch64.rpm"
RPM_HASH = "a2f31852aac066df267e0630e96257f3e11c514e4e5aac7626d1a928ffa18003312512bfbd6a19a169124c70210e21ae53de6b0775466c386bea8732111f1834"

RPROVIDES:${PN} += "config(pptpd) \
pptpd \
pptpd(aarch-64)"

RDEPENDS:${PN} += "(kmod(ppp_mppe.ko) if kernel) \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
ppp"

inherit rpm
