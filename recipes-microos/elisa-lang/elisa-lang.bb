SUMMARY = "Translations for package elisa"
DESCRIPTION = "Provides translations for the 'elisa' package."
LICENSE = "LGPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "elisa-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ebf4e63c73bb9e8979c05357ae2342a846c8416a756858a0a0e4563d82022f7ef273856fbc27aee5487bc17247818ddfa252e964db9706b158371243b6889fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elisa-lang elisa-lang-all locale(elisa:ar) locale(elisa:az) locale(elisa:be) locale(elisa:bg) locale(elisa:bs) locale(elisa:ca) locale(elisa:ca@valencia) locale(elisa:cs) locale(elisa:da) locale(elisa:de) locale(elisa:el) locale(elisa:en_GB) locale(elisa:es) locale(elisa:et) locale(elisa:eu) locale(elisa:fi) locale(elisa:fr) locale(elisa:gl) locale(elisa:hi) locale(elisa:hu) locale(elisa:ia) locale(elisa:id) locale(elisa:it) locale(elisa:ja) locale(elisa:ka) locale(elisa:ko) locale(elisa:lt) locale(elisa:nl) locale(elisa:nn) locale(elisa:pa) locale(elisa:pl) locale(elisa:pt) locale(elisa:pt_BR) locale(elisa:ro) locale(elisa:ru) locale(elisa:sk) locale(elisa:sl) locale(elisa:sv) locale(elisa:ta) locale(elisa:tr) locale(elisa:uk) locale(elisa:zh_CN) locale(elisa:zh_TW)"
RDEPENDS:${PN} += "elisa"

inherit rpm
