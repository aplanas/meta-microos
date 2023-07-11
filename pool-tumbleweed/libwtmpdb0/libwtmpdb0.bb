SUMMARY = "PAM module to store login and logout of users"
DESCRIPTION = "The libwtmpdb provides various interfaces to read, write or modify the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "libwtmpdb0-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "2d79d5d03884430afb5d45d81f0ac1df4729001ba8f10e96a5edfad8c2d8eed03d445d48d5f338fca96cb88b1accd2f7584b713283979a654fb8646b55296dda"

RPROVIDES:${PN} += "libwtmpdb.so.0 \
libwtmpdb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
