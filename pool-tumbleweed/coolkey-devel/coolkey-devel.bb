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

RPM_NAME = "coolkey-devel-1.1.0-152.5.aarch64.rpm"
RPM_HASH = "0c7e50aaddc9bfbbc78ebacaec85b6c1c1c9bcaae6b992a306c1c3ba1e92305367de63f59ba716224dd11809113c7426d3dd7e4a0fd75e7178a9fb7edba6266c"

RPROVIDES:${PN} += "coolkey-devel \
coolkey-devel(aarch-64) \
pkgconfig(libckyapplet)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
coolkey"

inherit rpm
