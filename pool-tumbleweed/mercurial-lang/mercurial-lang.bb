SUMMARY = "Translations for package mercurial"
DESCRIPTION = "Provides translations for the 'mercurial' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.3"

RPM_NAME = "mercurial-lang-6.4.3-1.1.noarch.rpm"
RPM_HASH = "8475289cb3a30c2043b9db1d3d197d62930e96e29ff6cb3326eeb22ae9ce0a5fd19f0c4d8206053244292f3d81ff53ff6b752b5346a6ce9c24c79ef17ebf0063"
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
