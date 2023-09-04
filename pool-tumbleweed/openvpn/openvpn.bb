SUMMARY = "Full-featured SSL VPN solution using a TUN/TAP Interface"
DESCRIPTION = "OpenVPN is an SSL VPN solution which can accommodate a wide \
range of configurations, including remote access, site-to-site VPNs, \
WiFi security, and remote access solutions with load \
balancing, failover, and fine-grained access-controls. \
 \
OpenVPN implements OSI layer 2 or 3 secure network extension using the \
SSL/TLS protocol, supports flexible client \
authentication methods based on certificates, smart cards, and/or \
2-factor authentication, and allows user or group-specific access \
control policies using firewall rules applied to the VPN virtual \
interface. \
 \
OpenVPN is not a web application proxy and does not operate through a \
web browser."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.6.6"

RPM_NAME = "openvpn-2.6.6-1.1.aarch64.rpm"
RPM_HASH = "d1619a13b3b88595c826d43ca69b80f4e5b3f50038055a2d51356a4bef00bd4256a3ef609f7bdf98acb2501d6b2dbc3eaff2568b6d7a4edb81b742c0a99cd0d4"

RPROVIDES:${PN} += "openvpn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcrypto.so.3 \
liblz4.so.1 \
liblzo2.so.2 \
libpkcs11-helper.so.1 \
libssl.so.3 \
libsystemd.so.0 \
pkcs11-helper"

inherit rpm
