SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-lang-3.1.6-4.1.noarch.rpm"
RPM_HASH = "b0d9258387a95eb1449557ea419628a2da1f26abfa3e3753e3d660a5117cf9a8091c7be448ea6deaeb47b1813cb8f83111af50a867b629694c84735fc10f577e"
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
