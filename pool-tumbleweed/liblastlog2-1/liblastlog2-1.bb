SUMMARY = "PAM module to report most recent login of users"
DESCRIPTION = "The liblastlog2 provides various interfaces to read, write or modify the lastlog 2 database."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "liblastlog2-1-1.1.0-2.2.aarch64.rpm"
RPM_HASH = "8026fe94926b4eb753d063ac63efc0ae45dda715b5162599db051ee61f40053a20522e00ddca07acffe83ae9db67f71802cc008ff933367d13542de9b8f2a348"

RPROVIDES:${PN} += "liblastlog2-1 \
liblastlog2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
