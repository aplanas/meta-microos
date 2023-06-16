SUMMARY = "CoolKey and CAC PKCS #11 PKI Module for Smart Cards"
DESCRIPTION = "Linux Driver support for the CoolKey and CAC products. CoolKeys are \
part of a complete PKI solution that provides smart card login, single \
sign-on, secure messaging, and secure email access. In the complete \
solution, users are issued CoolKeys by their employer, ISP, bank, or \
other parties. When the user plugs the keys in for the first time, the \
keys are automatically provisioned with certificates, keys, and a PIN, \
unique for that user by the Red Hat Certificate System. Once the \
CoolKey is provisioned, the user can take the key to any system and use \
it to login (authenticate), send and receive signed and encrypted \
email, or participate in secure messaging or IRC communication. \
CoolKeys are based on JavaCard 1.2."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "coolkey-1.1.0-152.5.aarch64.rpm"
RPM_HASH = "420104b29837722292d2a5d47d9a289460f94e27f0df51412fa27e52a5ad9ed5e3c1004ef3666986a0c8033a21a12303da992c633602c0d07cf9f8119c350dd5"

RPROVIDES:${PN} += "coolkey \
libckyapplet.so.1 \
libcoolkeypk11.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoftokn3.so \
libstdc++.so.6 \
libz.so.1 \
pcsc-ccid"

inherit rpm
