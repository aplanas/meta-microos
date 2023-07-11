SUMMARY = "Translations for package meteo"
DESCRIPTION = "Provides translations for the 'meteo' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.9.1"

RPM_NAME = "meteo-lang-0.9.9.1-1.11.noarch.rpm"
RPM_HASH = "f1e3e9f92025601b240cbea314c238fbf8a2575c63c50cce51d89fb8e1da6cf642f044b6429c95c3a240999f7798bba3ddf95ff2a5a3efeb2dbb6db91298d991"
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
