SUMMARY = "Translations for package pidgin-plugin-otr"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-otr' package."
LICENSE = "GPL-2.0+"

PV = "4.0.2"

RPM_NAME = "pidgin-plugin-otr-lang-4.0.2-3.25.noarch.rpm"
RPM_HASH = "a7b317798afc7c6ecce183decf5026e189957bf86ccacc859d03833068e85c46376be8b568d9f0d0f8894e453940a2c83c7cab8b40d2a7e29e2e9f6d50221998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pidgin-plugin-otr:ar) \
locale(pidgin-plugin-otr:cs) \
locale(pidgin-plugin-otr:da) \
locale(pidgin-plugin-otr:de) \
locale(pidgin-plugin-otr:el) \
locale(pidgin-plugin-otr:es) \
locale(pidgin-plugin-otr:fa) \
locale(pidgin-plugin-otr:fi) \
locale(pidgin-plugin-otr:fr) \
locale(pidgin-plugin-otr:hu) \
locale(pidgin-plugin-otr:it) \
locale(pidgin-plugin-otr:nb_NO) \
locale(pidgin-plugin-otr:nl) \
locale(pidgin-plugin-otr:nn) \
locale(pidgin-plugin-otr:pl) \
locale(pidgin-plugin-otr:pt_BR) \
locale(pidgin-plugin-otr:ru) \
locale(pidgin-plugin-otr:sk) \
locale(pidgin-plugin-otr:sv) \
locale(pidgin-plugin-otr:vi) \
locale(pidgin-plugin-otr:zh_CN) \
pidgin-plugin-otr-lang \
pidgin-plugin-otr-lang-all"
RDEPENDS:${PN} += "pidgin-plugin-otr"

inherit rpm
