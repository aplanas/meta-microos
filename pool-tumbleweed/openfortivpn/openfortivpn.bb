SUMMARY = "Client for PPP+SSL VPN tunnel services"
DESCRIPTION = "openfortivpn is a client for PPP+SSL VPN tunnel services. It spawns a pppd \
process and operates the communication between the gateway and this process. \
 \
It is compatible with Fortinet VPNs."
LICENSE = "GPL-3.0-or-later"

PV = "1.20.1"

RPM_NAME = "openfortivpn-1.20.1-1.3.aarch64.rpm"
RPM_HASH = "864114ad6072bd1879424cc87071ddf0b3a97a96f4358423c0ce8c4615182bc3e637ba629725e7da0663bb694cc08f26cfb442d80ac49427a52918b20849d100"

RPROVIDES:${PN} += "config-openfortivpn \
openfortivpn"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
ppp"

inherit rpm
