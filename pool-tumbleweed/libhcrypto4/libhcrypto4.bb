SUMMARY = "Cryptographic library from Heimdal Kerberos"
DESCRIPTION = "This package contains the cryptographic library required for Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libhcrypto4-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "dbcadf825e1522679a12881b911a8c6d81195ab9348b505e80e021d4e8ed0fa79f54805620fb5288610495f3117a0ceef4bb7f95ca598e55cf39950daec866bb"

RPROVIDES:${PN} += "libhcrypto.so.4 \
libhcrypto4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libheimbase.so.1 \
libroken.so.18"

inherit rpm
