SUMMARY = "Translations for package texamator"
DESCRIPTION = "Provides translations for the 'texamator' package."
LICENSE = "GPL-3.0-only"

PV = "3.0+git.20190226.91432e4"

RPM_NAME = "texamator-lang-3.0+git.20190226.91432e4-1.20.noarch.rpm"
RPM_HASH = "54845569863aff952a7263b19a34761ec37c0f1867706995bbd1644cb4352178189657d2a777023e786cb6bb03057aa8760587c864efd1fd9c5810a2cfe90ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texamator-lang \
texamator-lang-all"

RDEPENDS:${PN} += "texamator"

inherit rpm
