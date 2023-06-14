SUMMARY = "PAM module to authenticate against a separate database"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains pam_userdb which is used to verify a \
username/password pair against values stored in a Berkeley DB database."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-userdb-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "60c3aecc8e232e047c452efface1ad494dca3d8cc66135e9463f5fc423be5d887e372766cc7890628b4ead544bff11f4db146f9c127bda2bd0ae0a457ca5f0b9"

RPROVIDES:${PN} += "pam-extra-/usr/lib64/security/pam-userdb.so \
pam-userdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libpam.so.0"

inherit rpm
