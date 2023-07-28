SUMMARY = "SPAKE preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a SPAKE plugin."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-plugin-preauth-spake-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "4dfdf09ea43bde9e5a1adba027996b4031334c50b2e839672080d564914c6302892855c1f2a2fdb3c0c2e7013302cb835a1d0656cce442926f127d34fd84c619"

RPROVIDES:${PN} += "krb5-plugin-preauth-spake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
