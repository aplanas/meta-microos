SUMMARY = "Translations for package arianna"
DESCRIPTION = "Provides translations for the 'arianna' package."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "arianna-lang-1.0.1-1.1.noarch.rpm"
RPM_HASH = "244c308df0a49545f0e978f9d0d75e7a2ea61e39e2067f8ec35be91e09e9a262688f46aef11f8dd5ba40f1f36ba434430400dd5092333731fe4aa4263eb6d0a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arianna-lang \
arianna-lang-all \
locale(arianna:ca) \
locale(arianna:ca@valencia) \
locale(arianna:cs) \
locale(arianna:de) \
locale(arianna:en_GB) \
locale(arianna:es) \
locale(arianna:eu) \
locale(arianna:fi) \
locale(arianna:fr) \
locale(arianna:gl) \
locale(arianna:hu) \
locale(arianna:ia) \
locale(arianna:it) \
locale(arianna:ka) \
locale(arianna:nl) \
locale(arianna:pt) \
locale(arianna:sk) \
locale(arianna:sl) \
locale(arianna:tr) \
locale(arianna:uk) \
locale(arianna:zh_CN)"

RDEPENDS:${PN} += "arianna"

inherit rpm
