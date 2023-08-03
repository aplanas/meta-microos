SUMMARY = "Translations for package meteo"
DESCRIPTION = "Provides translations for the 'meteo' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.9.2"

RPM_NAME = "meteo-lang-0.9.9.2-1.1.noarch.rpm"
RPM_HASH = "816b3116079ee72b6fa4b229adefccc81d05ae9d584cc0c3f8f2e6687f267f6afc1679b2a28bf7433ff4d5c6cd27413b82d34b8ac9a90fd3c0743b578eb3ab3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-meteo-ca \
locale-meteo-de \
locale-meteo-en \
locale-meteo-es \
locale-meteo-es-ES \
locale-meteo-fr \
locale-meteo-lt \
locale-meteo-nb \
locale-meteo-nl \
locale-meteo-pt \
locale-meteo-pt-BR \
locale-meteo-pt-PT \
locale-meteo-ru \
locale-meteo-sr \
locale-meteo-tr \
locale-meteo-uk \
meteo-lang \
meteo-lang-all"

RDEPENDS:${PN} += "meteo"

inherit rpm
