SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-lang-3.1.6-2.1.noarch.rpm"
RPM_HASH = "28d79efc59ab7d526e2c5c4f824c3c45ad78d4bac9cb87976ad1f8037c51edb5982cbb09c7b9f0bcee1a868df342463487f2d50f22beb9e010179c2ab210b669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-utils-lang \
apparmor-utils-lang-all \
locale-apparmor-utils-af \
locale-apparmor-utils-bs \
locale-apparmor-utils-de \
locale-apparmor-utils-en-GB \
locale-apparmor-utils-es \
locale-apparmor-utils-fa \
locale-apparmor-utils-fr \
locale-apparmor-utils-hi \
locale-apparmor-utils-id \
locale-apparmor-utils-it \
locale-apparmor-utils-ko \
locale-apparmor-utils-pl \
locale-apparmor-utils-pt \
locale-apparmor-utils-pt-BR \
locale-apparmor-utils-ru \
locale-apparmor-utils-sv \
locale-apparmor-utils-tr \
locale-apparmor-utils-ug \
locale-apparmor-utils-uk \
locale-apparmor-utils-zh-CN"

RDEPENDS:${PN} += "apparmor-utils"

inherit rpm
