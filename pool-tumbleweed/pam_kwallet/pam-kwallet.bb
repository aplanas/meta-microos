SUMMARY = "A PAM Module for KWallet signing"
DESCRIPTION = "This PAM module allows you to automatically open your kwallet \
when signing into your account."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "pam_kwallet-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "262be88a80b61ab3c3e401f9e16a6313716a7eddfa9cc545c4b9ee772fd2fef9998f71e59cf2c0644b2ca5c2a6026169a18cb34c98a1a9d9fa760da047ac929d"

RPROVIDES:${PN} += "pam-kwallet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libpam.so.0 \
pam \
pam-config \
pam-kwallet-common"

inherit rpm
