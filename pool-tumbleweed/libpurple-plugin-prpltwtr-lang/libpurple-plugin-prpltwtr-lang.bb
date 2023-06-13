SUMMARY = "Translations for package libpurple-plugin-prpltwtr"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-prpltwtr' package."
LICENSE = "GPL-2.0+"

PV = "0.14.0"

RPM_NAME = "libpurple-plugin-prpltwtr-lang-0.14.0-1.27.noarch.rpm"
RPM_HASH = "e1be2c70276c2c4bdbfc2d559016184c54d8c1ae22c190b6d6ab3ca70b3a9bde67026c4ee91260fc72b1b056e8db5a8c8454a3226173b07f55cce8c4e9e90416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-prpltwtr-lang \
libpurple-plugin-prpltwtr-lang-all \
locale(libpurple-plugin-prpltwtr:es) \
locale(libpurple-plugin-prpltwtr:ja)"

RDEPENDS:${PN} += "libpurple-plugin-prpltwtr"

inherit rpm
