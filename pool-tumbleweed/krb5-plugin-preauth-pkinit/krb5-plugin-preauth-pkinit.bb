SUMMARY = "PKINIT preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a PKINIT plugin."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-plugin-preauth-pkinit-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "845034d3b8159c00cd45638d48d5c0cbdb4a42a7aae0d23be9c73d478c8b980571547dd6bebd8922a79292af405fd2daa677ed0e6efa9dd919be26f696fe58d6"

RPROVIDES:${PN} += "krb5-plugin-preauth-pkinit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
