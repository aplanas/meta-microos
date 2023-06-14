SUMMARY = "Translations for package meteo"
DESCRIPTION = "Provides translations for the 'meteo' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.9.1"

RPM_NAME = "meteo-lang-0.9.9.1-1.10.noarch.rpm"
RPM_HASH = "3f257bf1488a4a9c55cb959d25cd499909b793bc5301627b69d0a191a9c3e9712b7ce066c014a373d295b82225e414eb28323605c9d5a893c91d82c5944248ed"
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
locale-meteo-uk \
meteo-lang \
meteo-lang-all"

RDEPENDS:${PN} += "meteo"

inherit rpm
