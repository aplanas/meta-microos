SUMMARY = "Translations for package msmtp"
DESCRIPTION = "Provides translations for the 'msmtp' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.24"

RPM_NAME = "msmtp-lang-1.8.24-1.1.noarch.rpm"
RPM_HASH = "7c1f1cd27b9a9d9ae6ca67d9243d507b43addc50b8ba20d15fde5151514ed1694c674a73c853bfc961ba75c378b6e012dae329a77593bc72ec91fcaee07f7e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-msmtp-de \
locale-msmtp-eo \
locale-msmtp-fr \
locale-msmtp-pt-BR \
locale-msmtp-ru \
locale-msmtp-sr \
locale-msmtp-sv \
locale-msmtp-ta \
locale-msmtp-uk \
msmtp-lang \
msmtp-lang-all"

RDEPENDS:${PN} += "msmtp"

inherit rpm
