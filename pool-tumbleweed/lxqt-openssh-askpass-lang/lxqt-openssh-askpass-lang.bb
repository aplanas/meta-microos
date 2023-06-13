SUMMARY = "Translations for package lxqt-openssh-askpass"
DESCRIPTION = "Provides translations for the 'lxqt-openssh-askpass' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-openssh-askpass-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "2c90fc86d0ece8154952016ce2f460d0708697b5a960e4c6ebbf6594667ee31ba3f53a6e765e17bd62aaa8461d5f0a3ad690eb0c92d68c49f80a2e94be11aa9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-openssh-askpass-lang \
lxqt-openssh-askpass-lang-all"

RDEPENDS:${PN} += "lxqt-openssh-askpass"

inherit rpm
