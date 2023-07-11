SUMMARY = "Translations for package osdlyrics"
DESCRIPTION = "Provides translations for the 'osdlyrics' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "osdlyrics-lang-0.5.13-1.4.noarch.rpm"
RPM_HASH = "8a089ecd9ac9a2a9bacd4752293f6170c09498a14b729aafec61a957c42ae5263c3fd95cbf9273bbb6e50840aa9ca49d186f91d6c344f90be702c7dd24a63516"
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
