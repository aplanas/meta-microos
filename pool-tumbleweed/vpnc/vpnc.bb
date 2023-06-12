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

RPM_NAME = "vpnc-0.5.3r550-3.13.aarch64.rpm"
RPM_HASH = "e77a133a127dcba65a940dff7bf4f7a15da9d063e3215c34182eb99442bd0a92f8544cdcdeb7b39397e7a1be5cd584f6566ac44fd531fa21c237bf04c7e63d41"

RPROVIDES:${PN} += "config(vpnc) \
vpnc \
vpnc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ip \
/usr/bin/perl \
/usr/bin/sed \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit)"

inherit rpm