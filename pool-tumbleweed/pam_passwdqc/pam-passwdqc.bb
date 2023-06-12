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

RPM_NAME = "pam_passwdqc-1.4.0-2.7.aarch64.rpm"
RPM_HASH = "33683752ff448b7f86355c951676c932e188078db47a8197c36e987aab3745947c10a5daa3543495c7ffc2c10b1444426bcdb47add0805ef40960a7caffbdb1c"

RPROVIDES:${PN} += "pam-modules:/usr/lib64/security/pam_passwdqc.so \
pam_passwdqc \
pam_passwdqc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpasswdqc.so.0()(64bit) \
pam"

inherit rpm
