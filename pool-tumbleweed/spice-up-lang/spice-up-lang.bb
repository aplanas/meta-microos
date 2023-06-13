SUMMARY = "Translations for package spice-up"
DESCRIPTION = "Provides translations for the 'spice-up' package."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-lang-1.9.1-1.7.noarch.rpm"
RPM_HASH = "7c8198098f58aadda8225f6f5e7b44bb7ef37f17a05b8e63b8ccf3562a6335ecf24681563cbd7f8ddd21a595619dca70ab4d5bb535f317a8d6095033e16e4be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(spice-up:ca) \
locale(spice-up:de) \
locale(spice-up:es) \
locale(spice-up:fr) \
locale(spice-up:ja) \
locale(spice-up:pt_BR) \
locale(spice-up:pt_PT) \
locale(spice-up:sr) \
locale(spice-up:sr@latin) \
spice-up-lang \
spice-up-lang-all"

RDEPENDS:${PN} += "spice-up"

inherit rpm
