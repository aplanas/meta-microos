SUMMARY = "A PAM Module for KWallet signing"
DESCRIPTION = "This PAM module allows you to automatically open your kwallet \
when signing into your account."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "pam_kwallet-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "050608944d57d0e237e14b34ca4c18dade7949f8576f6e5255f90e4b63873e734decba0bf2ad8a9ca3ecd27a85e82ee7452e880e42e70c2253cc44305e61fe24"

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
