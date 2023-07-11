SUMMARY = "PAM module to authenticate against a separate database"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains pam_userdb which is used to verify a \
username/password pair against values stored in a Berkeley DB database."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-userdb-1.5.3-1.2.aarch64.rpm"
RPM_HASH = "f122321651323b7821a9882eac3a8bc65196294eea56a1c70242bc2b983aba16bc358fb951f7250a90e6a6595cbd29818dfae8e52283dad51c22ecee464c6939"

RPROVIDES:${PN} += "pam-extra-/usr/lib64/security/pam-userdb.so \
pam-userdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libpam.so.0"

inherit rpm
