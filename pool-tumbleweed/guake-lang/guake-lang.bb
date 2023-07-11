SUMMARY = "Translations for package guake"
DESCRIPTION = "Provides translations for the 'guake' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "guake-lang-3.10-1.1.noarch.rpm"
RPM_HASH = "dce4d7c7dd5c63bd38457fa7910f36fa8f995b6efb47ced1d042ac59d0775b6e489d86bb21c541dbd3e6b956bc523b7ecd91adaefc736ab0616e3b60730e2f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake-lang \
guake-lang-all \
locale-guake-ca \
locale-guake-cs \
locale-guake-de \
locale-guake-el \
locale-guake-es \
locale-guake-fa \
locale-guake-fi \
locale-guake-fr \
locale-guake-gl \
locale-guake-hr \
locale-guake-hu \
locale-guake-id \
locale-guake-it \
locale-guake-ja \
locale-guake-ko \
locale-guake-nb \
locale-guake-nl \
locale-guake-pa \
locale-guake-pl \
locale-guake-pt-BR \
locale-guake-ru \
locale-guake-sv \
locale-guake-tr \
locale-guake-uk \
locale-guake-zh-CN \
locale-guake-zh-TW"

RDEPENDS:${PN} += "guake"

inherit rpm
