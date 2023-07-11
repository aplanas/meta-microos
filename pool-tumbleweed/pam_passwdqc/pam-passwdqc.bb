SUMMARY = "Simple Password Strength Checking Module"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_passwdqc is a simple password strength checking module forPAM-aware \
password changing programs. In addition to checking regular passwords, \
it offers support for passphrases and can provide randomly generated \
ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "pam_passwdqc-1.4.0-2.8.aarch64.rpm"
RPM_HASH = "45f4273817012d4f78251c8c8c7d86fb6890ac61d9543349d9aca041862783277f22667eac1f9d26987ba358433ab69485cf35db2006097bdc17334da3507a4a"

RPROVIDES:${PN} += "pam-modules-/usr/lib64/security/pam-passwdqc.so \
pam-passwdqc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
libpasswdqc.so.0 \
pam"

inherit rpm
