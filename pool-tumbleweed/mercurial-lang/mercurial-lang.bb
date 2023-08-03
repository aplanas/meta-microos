SUMMARY = "Translations for package mercurial"
DESCRIPTION = "Provides translations for the 'mercurial' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.5"

RPM_NAME = "mercurial-lang-6.5-1.1.noarch.rpm"
RPM_HASH = "730ecfc6311aacc8758df09bb5d25f1ee64d602ab9bbd21b86e2d75bbaf510cd551a1891c1497d32cddcddc12fd5215c349df32d34afdd68beceaf72e3ddb43f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mercurial-da \
locale-mercurial-de \
locale-mercurial-el \
locale-mercurial-fr \
locale-mercurial-it \
locale-mercurial-ja \
locale-mercurial-pt-BR \
locale-mercurial-ro \
locale-mercurial-ru \
locale-mercurial-sv \
locale-mercurial-zh-CN \
locale-mercurial-zh-TW \
mercurial-lang \
mercurial-lang-all"

RDEPENDS:${PN} += "mercurial"

inherit rpm
