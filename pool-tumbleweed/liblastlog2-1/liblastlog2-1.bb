SUMMARY = "PAM module to report most recent login of users"
DESCRIPTION = "The liblastlog2 provides various interfaces to read, write or modify the lastlog 2 database."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "liblastlog2-1-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "01555c53779f69780cb1b946f1df31f112b5d79d39ddf8038770a9a2b5ed56e8d37eac8e0889503172673409757f42821e60ad8c8d2814c9805544c53b3c5ffb"

RPROVIDES:${PN} += "liblastlog2-1 \
liblastlog2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
