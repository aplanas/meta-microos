SUMMARY = "Translations for package mate-eiciel"
DESCRIPTION = "Provides translations for the 'mate-eiciel' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-lang-1.20.1-2.10.noarch.rpm"
RPM_HASH = "ae48ee551d76a051dbe2fa91defbc7acb1190084bd7aa79f1e68e5b7da3bcc1531f31cd6ea529c56b3c268c7ca97efb4dbfe84970f2946ad3d192b82d59e2fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-eiciel-ar \
locale-mate-eiciel-ca \
locale-mate-eiciel-cs \
locale-mate-eiciel-de \
locale-mate-eiciel-en-GB \
locale-mate-eiciel-en-US \
locale-mate-eiciel-es \
locale-mate-eiciel-fr \
locale-mate-eiciel-hu \
locale-mate-eiciel-it \
locale-mate-eiciel-ja \
locale-mate-eiciel-ko \
locale-mate-eiciel-nl \
locale-mate-eiciel-pl \
locale-mate-eiciel-pt-BR \
locale-mate-eiciel-ru \
locale-mate-eiciel-sv \
locale-mate-eiciel-zh-CN \
locale-mate-eiciel-zh-TW \
mate-eiciel-lang \
mate-eiciel-lang-all"

RDEPENDS:${PN} += "mate-eiciel"

inherit rpm
