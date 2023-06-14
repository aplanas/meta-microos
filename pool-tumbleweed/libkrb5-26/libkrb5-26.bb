SUMMARY = "Kerberos 5 API for Heimdal Kerberos"
DESCRIPTION = "This package contains the Kerberos 5 library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkrb5-26-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "2edb03ade66a5d370ef5ffd9529ca6cc0a2982780d4ad7de6f1339855373260c74e44cb4593b1442a620d88f19a9b738c4f593567d6575e333b15b98573e4732"

RPROVIDES:${PN} += "libkrb5-26 \
libkrb5.so.26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libhcrypto.so.4 \
libheimbase.so.1 \
libhx509.so.5 \
libroken.so.18 \
libsqlite3.so.0 \
libwind.so.0"

inherit rpm
