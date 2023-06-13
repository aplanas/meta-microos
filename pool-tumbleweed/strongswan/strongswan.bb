SUMMARY = "IPsec-based VPN solution"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
* Implements both the IKEv1 and IKEv2 (RFC 4306) key exchange protocols \
* Fully tested support of IPv6 IPsec tunnel and transport connections \
* Dynamic IP address and interface update with IKEv2 MOBIKE (RFC 4555) \
* Automatic insertion and deletion of IPsec-policy-based firewall rules \
* Strong 128/192/256 bit AES or Camellia encryption, 3DES support \
* NAT Traversal via UDP encapsulation and port floating (RFC 3947) \
* Dead Peer Detection (DPD, RFC 3706) takes care of dangling tunnels \
* Static virtual IP addresses and IKEv1 ModeConfig pull and push modes \
* XAUTH server and client functionality on top of IKEv1 Main Mode authentication \
* Virtual IP address pool managed by IKE daemon or SQL database \
* Secure IKEv2 EAP user authentication (EAP-SIM, EAP-AKA, EAP-MSCHAPv2, etc.) \
* Optional relaying of EAP messages to AAA server via EAP-RADIUS plugin \
* Support of IKEv2 Multiple Authentication Exchanges (RFC 4739) \
* Authentication based on X.509 certificates or preshared keys \
* Generation of a default self-signed certificate during first strongSwan startup \
* Retrieval and local caching of Certificate Revocation Lists via HTTP or LDAP \
* Full support of the Online Certificate Status Protocol (OCSP, RCF 2560). \
* CA management (OCSP and CRL URIs, default LDAP server) \
* Powerful IPsec policies based on wildcards or intermediate CAs \
* Group policies based on X.509 attribute certificates (RFC 3281) \
* Storage of RSA private keys and certificates on a smartcard (PKCS #11 interface) \
* Modular plugins for crypto algorithms and relational database interfaces \
* Support of elliptic curve DH groups and ECDSA certificates (Suite B, RFC 4869) \
* Optional built-in integrity and crypto tests for plugins and libraries \
* Linux desktop integration via the strongSwan NetworkManager applet \
 \
This package triggers the installation of both, IKEv1 and IKEv2 daemons."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "7eefc6307a37a9cf490b7578a349b2c67a47b78e795a18fc5f11ba942a77dce9689a528cd82fe0aec3da976026e69520867245f121a51157fbabfd88d0f54b8d"

RPROVIDES:${PN} += "strongswan \
strongswan(aarch-64)"

RDEPENDS:${PN} += "strongswan-ipsec \
systemd"

inherit rpm
