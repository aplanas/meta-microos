SUMMARY = "Support files for the KWallet PAM module"
DESCRIPTION = "This package contains support files used by the KWallet PAM \
module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "pam_kwallet-common-5.27.6-1.1.noarch.rpm"
RPM_HASH = "446d6d3129dd2de04fce4e2a73f91e1ce92921a49f7b2c853e89b8519750fab261df039789a879674d6a0da4290eec6abcccf3e6c1ca10b4c8837e384e06b647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pam-kwallet-common \
pam-kwallet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kwalletd5 \
socat"

inherit rpm
