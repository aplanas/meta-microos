SUMMARY = "Translations for package gobby"
DESCRIPTION = "Provides translations for the 'gobby' package."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "0.5.1+20180826.d16519e"

RPM_NAME = "gobby-lang-0.5.1+20180826.d16519e-2.11.noarch.rpm"
RPM_HASH = "177c1ee38654b2130a32790ac95e687417c1d6a292644afbfc2878b88bcc98b9cd5e8ce24b13fb8f7dd96dcabad2bc97764cd7e7a0d8b37ba39260763cb969f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gobby-lang \
gobby-lang-all \
locale(gobby:ca) \
locale(gobby:de) \
locale(gobby:el_GR) \
locale(gobby:en_GB) \
locale(gobby:fr) \
locale(gobby:it_IT) \
locale(gobby:ja) \
locale(gobby:pt_BR) \
locale(gobby:zh_TW)"

RDEPENDS:${PN} += "gobby"

inherit rpm
