SUMMARY = "SPAKE preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a SPAKE plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-preauth-spake-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "6b124b73dbdb7c10f6e96151b004466d6d4f2598646fdebf031a3d2960c80edec388dc48ec5d8029df246201057a6b676538c5c20549379fb013bd2f8f819295"

RPROVIDES:${PN} += "krb5-plugin-preauth-spake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
