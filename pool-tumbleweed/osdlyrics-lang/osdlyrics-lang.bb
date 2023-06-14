SUMMARY = "Translations for package osdlyrics"
DESCRIPTION = "Provides translations for the 'osdlyrics' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "osdlyrics-lang-0.5.13-1.3.noarch.rpm"
RPM_HASH = "ff8669d65729e51ffe2269ec5a554ed623c44fa11b12afb2847778075cd049daa38ceb9002a811a364fd02b9cc0c849614e9b789d21e713857cccb4e400c3cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-osdlyrics-cs \
locale-osdlyrics-de \
locale-osdlyrics-es \
locale-osdlyrics-fr \
locale-osdlyrics-it \
locale-osdlyrics-ms \
locale-osdlyrics-pt-BR \
locale-osdlyrics-ro \
locale-osdlyrics-ru \
locale-osdlyrics-tr \
locale-osdlyrics-uk \
locale-osdlyrics-zh-CN \
locale-osdlyrics-zh-HK \
locale-osdlyrics-zh-TW \
osdlyrics-lang \
osdlyrics-lang-all"

RDEPENDS:${PN} += "osdlyrics"

inherit rpm
