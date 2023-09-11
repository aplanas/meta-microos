SUMMARY = "Translations for package partclone"
DESCRIPTION = "Provides translations for the 'partclone' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.25"

RPM_NAME = "partclone-lang-0.3.25-1.1.noarch.rpm"
RPM_HASH = "ff188355995dfbfd53751c64d1a29e87dcf0971f5197ec9a59e6f7145b473dc1173144ec437787d864d3e9dde18de863ff883fbae0b2e94006ccd6804f39d7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-partclone-de \
locale-partclone-fr-FR \
locale-partclone-pt-BR \
locale-partclone-ru \
locale-partclone-vi \
locale-partclone-zh-CN \
locale-partclone-zh-TW \
partclone-lang \
partclone-lang-all"

RDEPENDS:${PN} += "partclone"

inherit rpm
