SUMMARY = "LDAP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the LDAP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-ldap-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "99721a80562e2baad57a7f3e64d7fe0d668d63b5ac5c7dcf1849881d0e8251e801c0ab120512cb505e4c969ce1f10e8016a6c0c84b189b1b9d174ee18a3e4645"

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
