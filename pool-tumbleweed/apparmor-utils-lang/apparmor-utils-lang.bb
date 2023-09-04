SUMMARY = "Translations for package apparmor-utils"
DESCRIPTION = "Provides translations for the 'apparmor-utils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-utils-lang-3.1.6-2.2.noarch.rpm"
RPM_HASH = "184be35d8c05c3c0d5d7357eb57b7eea45ceb514ea8c916582b7e7e1bdef10dfb4ef26f2b9239d23595b045bf9f5d922aedffd74d9f50d334633ca06f89a2b56"
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
