SUMMARY = "PAM module to authenticate against a separate database"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains pam_userdb which is used to verify a \
username/password pair against values stored in a Berkeley DB database."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-userdb-1.5.3-3.1.aarch64.rpm"
RPM_HASH = "52b949c788a5a03fef1cf61f530ce87a22b9244e6ce1948de0f44fc453e27a3db967163d21c4da0e62af9b23b0cc27af2e1c44d85661605c8e16c00820464ee9"

RPROVIDES:${PN} += "pam-extra-/usr/lib64/security/pam-userdb.so \
pam-userdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libpam.so.0"

inherit rpm
