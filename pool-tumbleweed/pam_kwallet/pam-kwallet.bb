SUMMARY = "A PAM Module for KWallet signing"
DESCRIPTION = "This PAM module allows you to automatically open your kwallet \
when signing into your account."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "pam_kwallet-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "cd048cfc95993581db3bdb57f4877d418a05438220de20c695383de308ebb60eb8ff398e8e10caf03a37d48765871b2a2659dbf035b661b005d7ab82fa78d78f"

RPROVIDES:${PN} += "pam-kwallet"

RDEPENDS:${PN} += "-pam-kwallet-32bit if pam-32bit \
/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libpam.so.0 \
pam \
pam-config \
pam-kwallet-common"

inherit rpm
