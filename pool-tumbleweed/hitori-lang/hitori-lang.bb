SUMMARY = "Translations for package hitori"
DESCRIPTION = "Provides translations for the 'hitori' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "hitori-lang-44.0-1.3.noarch.rpm"
RPM_HASH = "19204a6b3a4beace0312f0265afee3780d26ca07c7148ad3d951982e252f82b6cdfdd68ea97f5177b1bcc764862729e7a9c453a2dc79fec28f4ddee55e3f23b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hitori-lang \
hitori-lang-all \
locale(hitori:ar) \
locale(hitori:as) \
locale(hitori:be) \
locale(hitori:bg) \
locale(hitori:bs) \
locale(hitori:ca) \
locale(hitori:ca@valencia) \
locale(hitori:cs) \
locale(hitori:da) \
locale(hitori:de) \
locale(hitori:el) \
locale(hitori:en_GB) \
locale(hitori:eo) \
locale(hitori:es) \
locale(hitori:eu) \
locale(hitori:fa) \
locale(hitori:fi) \
locale(hitori:fr) \
locale(hitori:fur) \
locale(hitori:gl) \
locale(hitori:he) \
locale(hitori:hr) \
locale(hitori:hu) \
locale(hitori:id) \
locale(hitori:it) \
locale(hitori:ja) \
locale(hitori:ka) \
locale(hitori:kk) \
locale(hitori:ko) \
locale(hitori:lt) \
locale(hitori:lv) \
locale(hitori:ml) \
locale(hitori:ms) \
locale(hitori:nb) \
locale(hitori:ne) \
locale(hitori:nl) \
locale(hitori:oc) \
locale(hitori:pa) \
locale(hitori:pl) \
locale(hitori:pt) \
locale(hitori:pt_BR) \
locale(hitori:ro) \
locale(hitori:ru) \
locale(hitori:sk) \
locale(hitori:sl) \
locale(hitori:sr) \
locale(hitori:sr@latin) \
locale(hitori:sv) \
locale(hitori:tr) \
locale(hitori:uk) \
locale(hitori:vi) \
locale(hitori:zh_CN) \
locale(hitori:zh_HK) \
locale(hitori:zh_TW)"

RDEPENDS:${PN} += "hitori"

inherit rpm
