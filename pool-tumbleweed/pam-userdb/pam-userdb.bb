SUMMARY = "PAM module to authenticate against a separate database"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains pam_userdb which is used to verify a \
username/password pair against values stored in a Berkeley DB database."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-userdb-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "b8006dcfa8042edd16057470ba1a1cf004b478368a71f2a93fa27731ef0cecd63bd75c442c18e7f734968ad5d64d706df853c4e859af65fcd43b16e714d46be6"

RPROVIDES:${PN} += "pam-extra-/usr/lib64/security/pam-userdb.so \
pam-userdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libpam.so.0"

inherit rpm
