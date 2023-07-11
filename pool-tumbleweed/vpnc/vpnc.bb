SUMMARY = "A Client for Cisco VPN concentrator"
DESCRIPTION = "A VPN client compatible with Cisco's EasyVPN equipment. \
 \
Cisco 3000, IOS routers, PIX/ASA Zecurity Appliances, and \
Juniper/Netscreen as well as Nortel Contivity (experimental). \
 \
Supported Authentications: Pre-Shared-Key + XAUTH, Pre-Shared-Key \
Supported IKE DH-Groups: dh1 dh2 dh5 Supported Hash Algo (IKE/IPSEC): \
md5 sha1 Supported Encryptions (IKE/IPSEC): (null) (1des) 3des aes128 \
aes192 aes256 Perfect Forward Secrecy: nopfs dh1 dh2 dh5 \
 \
It runs entirely in userspace and uses the TUN/TAP driver for access."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.3r550"

RPM_NAME = "vpnc-0.5.3r550-3.14.aarch64.rpm"
RPM_HASH = "a28d4b16fb3c04ac5764d3b18ba773d1420f9c0c9de3d407d8467fcb792e276680a42ff3ac1776313d071602019fb33d7f1a2bed7ecb380eeb0626c523f5ff5b"

RPROVIDES:${PN} += "config-vpnc \
vpnc"

RDEPENDS:${PN} += "/sbin/ip \
/usr/bin/perl \
/usr/bin/sed \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30"

inherit rpm
