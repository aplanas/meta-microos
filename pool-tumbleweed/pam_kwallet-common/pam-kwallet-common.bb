SUMMARY = "Support files for the KWallet PAM module"
DESCRIPTION = "This package contains support files used by the KWallet PAM \
module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "pam_kwallet-common-5.27.7-1.1.noarch.rpm"
RPM_HASH = "52f650104644f21bb85f4c2c5c8c50edc729e8d137b9384ef7334ca5cbb53b92fce389afcbe87a87ddb9b2c77fd334d2682a96bea69a770fab44a0c48e76d5a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pam-kwallet-common \
pam-kwallet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kwalletd5 \
socat"

inherit rpm
