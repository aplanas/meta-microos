SUMMARY = "Translations for package msmtp"
DESCRIPTION = "Provides translations for the 'msmtp' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.23"

RPM_NAME = "msmtp-lang-1.8.23-1.3.noarch.rpm"
RPM_HASH = "c785586d2ddd987bfcde50bb176f51e3b1056fce2529794e3e961dd73ab4c43853d0828ca7161c6e85f06b9f44722f8f03c4ed9381e1bf5f7efcd2b43f7ecab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(msmtp:de) \
locale(msmtp:eo) \
locale(msmtp:fr) \
locale(msmtp:pt_BR) \
locale(msmtp:sr) \
locale(msmtp:sv) \
locale(msmtp:ta) \
locale(msmtp:uk) \
msmtp-lang \
msmtp-lang-all"
RDEPENDS:${PN} += "msmtp"

inherit rpm
