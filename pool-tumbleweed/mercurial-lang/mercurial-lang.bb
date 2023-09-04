SUMMARY = "Translations for package mercurial"
DESCRIPTION = "Provides translations for the 'mercurial' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "mercurial-lang-6.5.1-1.1.noarch.rpm"
RPM_HASH = "9535cca6ba3393216c893a1b722ec8f5ceb29e8bd1d5f0d52151e4441ac5e8b399800da0aca549526946c541414b3354c6fd2a6cf79ebb42d2dad1df9997ff72"
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
