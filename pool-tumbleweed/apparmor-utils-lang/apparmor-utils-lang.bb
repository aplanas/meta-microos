SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-lang-3.1.6-1.1.noarch.rpm"
RPM_HASH = "46bdfdf97b650099f28c760a0bb39a2a058527f4f26c9794b929e7a723a1a82fbc7b14109ae382a95abf08464614151b61611cfc5742de033b21103894e935b2"
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
