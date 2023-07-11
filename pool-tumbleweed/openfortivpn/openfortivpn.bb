SUMMARY = "Client for PPP+SSL VPN tunnel services"
DESCRIPTION = "openfortivpn is a client for PPP+SSL VPN tunnel services. It spawns a pppd \
process and operates the communication between the gateway and this process. \
 \
It is compatible with Fortinet VPNs."
LICENSE = "GPL-3.0-or-later"

PV = "1.20.5"

RPM_NAME = "openfortivpn-1.20.5-1.1.aarch64.rpm"
RPM_HASH = "ab66e94953b5ae085b9676fc2cd47f3369c0d99bc5cea70735c97a869e6e3f2d66f12f05ac012249088e3e0c691337989de78131985aedaa1ad3022d2b2aada2"

RPROVIDES:${PN} += "config-openfortivpn \
openfortivpn"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
ppp"

inherit rpm
