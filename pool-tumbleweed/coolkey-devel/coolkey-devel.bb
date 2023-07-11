SUMMARY = "CoolKey and CAC PKCS #11 PKI Module for Smart Cards"
DESCRIPTION = "Linux Driver support for the CoolKey and CAC products. \
 \
CoolKeys are part of complete PKI solution that provides smart card \
login, single sign-on, secure messaging, and secure email access. In \
the complete solution, users are issued CoolKeys by their employer, \
ISP, bank, or other agency. When the user plugs in the keys for the \
first time, the keys are automatically provisioned with certificates, \
keys, and a PIN unique to that user by the Red Hat Certificate System. \
Once the CoolKey is provisioned, the user can take the key to any \
system and use it to login (authenticate), send and receive signed and \
encrypted email, or participate in secure messaging or IRC \
communication. \
 \
CoolKeys are based on JavaCard 1.2."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "coolkey-devel-1.1.0-152.6.aarch64.rpm"
RPM_HASH = "28abefc582f3c91aa9dc9a2b43d4a315aebb2288b9cd37e3d3b5483fc1fb054e6a6d77d086e5b6d60137ea1ce2b9e08be39c574642379e3dea3af9b6047f3e39"

RPROVIDES:${PN} += "coolkey-devel \
pkgconfig-libckyapplet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
coolkey"

inherit rpm
