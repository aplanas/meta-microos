SUMMARY = "Translations for package diffutils"
DESCRIPTION = "Provides translations for the 'diffutils' package."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.9"

RPM_NAME = "diffutils-lang-3.9-1.3.noarch.rpm"
RPM_HASH = "cba13212ee60c8c293528061e045a93b66fe7d3d0dc166fe8f6634f29b2b034cda232814f394300cfb714e8be618257e3096f25582dd8ff39fb7f826a06f70cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffutils-lang diffutils-lang-all locale(diffutils:bg) locale(diffutils:ca) locale(diffutils:cs) locale(diffutils:da) locale(diffutils:de) locale(diffutils:el) locale(diffutils:eo) locale(diffutils:es) locale(diffutils:fi) locale(diffutils:fr) locale(diffutils:ga) locale(diffutils:gl) locale(diffutils:he) locale(diffutils:hr) locale(diffutils:hu) locale(diffutils:id) locale(diffutils:it) locale(diffutils:ja) locale(diffutils:ka) locale(diffutils:ko) locale(diffutils:lv) locale(diffutils:ms) locale(diffutils:nb) locale(diffutils:nl) locale(diffutils:pl) locale(diffutils:pt) locale(diffutils:pt_BR) locale(diffutils:ro) locale(diffutils:ru) locale(diffutils:sr) locale(diffutils:sv) locale(diffutils:tr) locale(diffutils:uk) locale(diffutils:vi) locale(diffutils:zh_CN) locale(diffutils:zh_TW)"
RDEPENDS:${PN} += "diffutils"

inherit rpm
