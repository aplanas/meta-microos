SUMMARY = "LDAP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the LDAP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-ldap-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "ae1cb7ffc7baece3ec8021c5bbd3ad8b26b12441411913536765a727f5d0e711f11f2f36faeead8b7db472fa4b5ced37788c4df407b5443502ca82fb3b806409"

RPROVIDES:${PN} += "libldapbackend.so \
pdns-backend-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libstdc++.so.6 \
pdns"

inherit rpm
