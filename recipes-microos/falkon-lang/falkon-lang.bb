SUMMARY = "Translations for package falkon"
DESCRIPTION = "Provides translations for the 'falkon' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "falkon-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "098c2f7d33ace35e2ee9f7099f31144d137ced910a15b8cc82e7effda5693a5c8705a0b1cf151f31125c6ce068317357a53f2c13edb719722aa1aeca4fc885f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falkon-lang falkon-lang-all locale(falkon:ar) locale(falkon:az) locale(falkon:bg) locale(falkon:ca) locale(falkon:ca@valencia) locale(falkon:cs) locale(falkon:da) locale(falkon:de) locale(falkon:el) locale(falkon:en) locale(falkon:en_GB) locale(falkon:es) locale(falkon:et) locale(falkon:eu) locale(falkon:fa) locale(falkon:fi) locale(falkon:fr) locale(falkon:gl) locale(falkon:hu) locale(falkon:ia) locale(falkon:id) locale(falkon:is) locale(falkon:it) locale(falkon:ja) locale(falkon:ka) locale(falkon:ko) locale(falkon:lt) locale(falkon:lv) locale(falkon:nb) locale(falkon:nl) locale(falkon:nn) locale(falkon:pa) locale(falkon:pl) locale(falkon:pt) locale(falkon:pt_BR) locale(falkon:ro) locale(falkon:ru) locale(falkon:sk) locale(falkon:sl) locale(falkon:sr) locale(falkon:sr@ijekavian) locale(falkon:sr@ijekavianlatin) locale(falkon:sr@latin) locale(falkon:sv) locale(falkon:ta) locale(falkon:tr) locale(falkon:uk) locale(falkon:zh_CN) locale(falkon:zh_HK) locale(falkon:zh_TW)"
RDEPENDS:${PN} += "falkon"

inherit rpm
