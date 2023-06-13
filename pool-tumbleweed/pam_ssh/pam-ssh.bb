SUMMARY = "PAM Module for SSH Authentication"
DESCRIPTION = "This module provides single sign-on behavior. The user types a \
passphrase when logging in and is allowed in if it decrypts the user s \
SSH private key. An ssh-agent is started and keys are added. For the \
entire session, the user types no more passwords."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "pam_ssh-2.3-4.5.aarch64.rpm"
RPM_HASH = "ecfcf5c1103b1da9e95f76e58bb285b8be6dcd30aa17457d90bc3e7b582157c77c3f61edac82fc92a32674c7297e8ff8049dd85498256ee2c8aa44d215639f4c"

RPROVIDES:${PN} += "pam_ssh \
pam_ssh(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit)"

inherit rpm
