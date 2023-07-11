SUMMARY = "PoPToP - PPTP Daemon, Linux as Microsoft VPN Server"
DESCRIPTION = "PoPToP is a PPTP(Point-to-Point Tunneling Protocol) server solution for \
Linux, it allows Linux servers to function seamlessly in the PPTP VPN \
environment. This release supports Windows 95/98/NT/2000 PPTP clients \
and PPTP Linux clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "pptpd-1.4.0-4.5.aarch64.rpm"
RPM_HASH = "1b6159a6922db144de8517175e934bf6b283dabfda824266fa8b06d77aec11ebe041ead4039f99a8e4caa01d38836a63126c0f8512e86130d16d542a4e4a37b8"

RPROVIDES:${PN} += "config-pptpd \
pptpd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
ppp"

inherit rpm
