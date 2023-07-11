SUMMARY = "Translations for package pspp"
DESCRIPTION = "Provides translations for the 'pspp' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-lang-1.4.1-3.14.noarch.rpm"
RPM_HASH = "1c540e8db0f1174384fd85a4f9f58dee0b6e1adebe2e63ccaad7ab4741ab1e143360f16aa060d4a1ea4456d88473d3379e9d6d60bc734ea7ee8678569e3a9d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pspp-ca \
locale-pspp-cs \
locale-pspp-de \
locale-pspp-el \
locale-pspp-es \
locale-pspp-fr \
locale-pspp-gl \
locale-pspp-hu \
locale-pspp-ja \
locale-pspp-lt \
locale-pspp-nl \
locale-pspp-pl \
locale-pspp-pt-BR \
locale-pspp-ru \
locale-pspp-sl \
locale-pspp-tr \
locale-pspp-uk \
locale-pspp-zh-CN \
pspp-lang \
pspp-lang-all"

RDEPENDS:${PN} += "pspp"

inherit rpm
