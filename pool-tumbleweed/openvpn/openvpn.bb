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
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.4"

RPM_NAME = "openvpn-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "688f96a3ca4ab284154231bdbe89a13bb0176c797bfe6302ec14fa608140094926e076e09619b49035b0b1f4ad344e7a11914b0df19f446695b4da7aebe7d25e"

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
