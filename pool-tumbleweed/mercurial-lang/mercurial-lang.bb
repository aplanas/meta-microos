SUMMARY = "Translations for package mercurial"
DESCRIPTION = "Provides translations for the 'mercurial' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "mercurial-lang-6.5.2-1.1.noarch.rpm"
RPM_HASH = "52b1ccc189a6ce070b042c46b5acca1789ea4dbbaccec233ba15c416cd74c318b775535e9221f6efa7ccd55cc412a0cae79e00e95ada256da2234e2e102bddd7"
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
