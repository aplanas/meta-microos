SUMMARY = "Translations for package geany"
DESCRIPTION = "Provides translations for the 'geany' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-lang-1.38-3.7.noarch.rpm"
RPM_HASH = "39bc440f77d70157813281e6787937513fe2c2698acd5d82b069ab076f9fdfde52a55e939c6e6c733e0f10c0e1de4ec4907b6e6506fb951407ddb980f5088b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geany-lang \
geany-lang-all \
locale(geany:ar) \
locale(geany:ast) \
locale(geany:be) \
locale(geany:bg) \
locale(geany:ca) \
locale(geany:cs) \
locale(geany:da) \
locale(geany:de) \
locale(geany:el) \
locale(geany:en_GB) \
locale(geany:es) \
locale(geany:et) \
locale(geany:eu) \
locale(geany:fa) \
locale(geany:fi) \
locale(geany:fr) \
locale(geany:gl) \
locale(geany:he) \
locale(geany:hi) \
locale(geany:hu) \
locale(geany:id) \
locale(geany:it) \
locale(geany:ja) \
locale(geany:kk) \
locale(geany:ko) \
locale(geany:lt) \
locale(geany:lv) \
locale(geany:nl) \
locale(geany:nn) \
locale(geany:pl) \
locale(geany:pt) \
locale(geany:pt_BR) \
locale(geany:ro) \
locale(geany:ru) \
locale(geany:sk) \
locale(geany:sl) \
locale(geany:sr) \
locale(geany:sv) \
locale(geany:tr) \
locale(geany:uk) \
locale(geany:vi) \
locale(geany:zh_CN) \
locale(geany:zh_TW)"
RDEPENDS:${PN} += "geany"

inherit rpm
