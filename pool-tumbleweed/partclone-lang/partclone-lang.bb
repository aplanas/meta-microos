SUMMARY = "Translations for package partclone"
DESCRIPTION = "Provides translations for the 'partclone' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.23"

RPM_NAME = "partclone-lang-0.3.23-1.5.noarch.rpm"
RPM_HASH = "7d0ae07335686462f8bb39c956c963165d6ad6de90db631ebe4f764b3a3572444c64a5d0b0aaab9df15a83ced2fb14ddf72c1c50186222a04053e3f6c2bf8ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-partclone-fr-FR \
locale-partclone-pt-BR \
locale-partclone-vi \
locale-partclone-zh-CN \
locale-partclone-zh-TW \
partclone-lang \
partclone-lang-all"

RDEPENDS:${PN} += "partclone"

inherit rpm
