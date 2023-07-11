SUMMARY = "Kerberos 5 API for Heimdal Kerberos"
DESCRIPTION = "This package contains the Kerberos 5 library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkrb5-26-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "73f82fea4655fcc90b3aa9368583227c56a9e97b20cbc1e34be6218b23f2ea38c006c410815c1338aaacdd0d6d4c7df8761ff1fc24d6a1d148f34892d8a4d63d"

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
