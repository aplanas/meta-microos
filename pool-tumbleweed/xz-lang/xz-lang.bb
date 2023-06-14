SUMMARY = "Translations for package xz"
DESCRIPTION = "Provides translations for the 'xz' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "xz-lang-5.4.3-1.1.noarch.rpm"
RPM_HASH = "f02efc577e6d15fc18b4e0185b52468688c982965e32c9af1bb104150ad6935b216f250aab96ae1edba699d340a9d1b3de439e7fb369ffe4dac93676fed055f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xz-ca \
locale-xz-cs \
locale-xz-da \
locale-xz-de \
locale-xz-eo \
locale-xz-es \
locale-xz-fi \
locale-xz-fr \
locale-xz-hr \
locale-xz-hu \
locale-xz-it \
locale-xz-ko \
locale-xz-pl \
locale-xz-pt \
locale-xz-pt-BR \
locale-xz-ro \
locale-xz-sr \
locale-xz-sv \
locale-xz-tr \
locale-xz-uk \
locale-xz-vi \
locale-xz-zh-CN \
locale-xz-zh-TW \
xz-lang \
xz-lang-all"

RDEPENDS:${PN} += "xz"

inherit rpm
