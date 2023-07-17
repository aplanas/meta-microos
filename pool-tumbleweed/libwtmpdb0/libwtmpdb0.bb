SUMMARY = "PAM module to store login and logout of users"
DESCRIPTION = "The libwtmpdb provides various interfaces to read, write or modify \
the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "libwtmpdb0-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "5099e1b899d1f6749ba0797613ab255709445e269e2741ddbd8e49684e631268a9acf838900e6356d896dd4dd25b76a0bb532013364a77da08e1ac4a6be83872"

RPROVIDES:${PN} += "libwtmpdb.so.0 \
libwtmpdb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
