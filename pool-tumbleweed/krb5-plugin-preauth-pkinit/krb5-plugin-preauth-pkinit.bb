SUMMARY = "PKINIT preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a PKINIT plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-preauth-pkinit-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "61e186f15d0736c332469c149a71404c3a80c46c09b1861d6cb66aecc8ce70e2c5646ab5816ec9ba7b5b5dff31510750211dd4afa6bc39e1e06b3c14aa3cfc3e"

RPROVIDES:${PN} += "krb5-plugin-preauth-pkinit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
