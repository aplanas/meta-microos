SUMMARY = "Translations for package mercurial"
DESCRIPTION = "Provides translations for the 'mercurial' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.4"

RPM_NAME = "mercurial-lang-6.4.4-1.2.noarch.rpm"
RPM_HASH = "d16702b11a8aecb039303b5ba945d7f402a19b64340573cb0d2ffbe29bbb1da84aee0186bcacaf1b6a0af2cecc8b51ad8d44e62d58ecb73ccf77122c70fd1d0d"
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
