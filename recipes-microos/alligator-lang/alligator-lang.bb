SUMMARY = "Translations for package alligator"
DESCRIPTION = "Provides translations for the 'alligator' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "alligator-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "c03dd9c0be89b9f8dad081750b749116f280627e3b5a6acc1bbb371fc036b238d83bde343b4eeeaf56bdbb34477b066796b62473fe5a24cc2237d1e947b503e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alligator-lang alligator-lang-all locale(alligator:ca) locale(alligator:ca@valencia) locale(alligator:cs) locale(alligator:de) locale(alligator:en_GB) locale(alligator:es) locale(alligator:et) locale(alligator:eu) locale(alligator:fi) locale(alligator:fr) locale(alligator:hu) locale(alligator:ia) locale(alligator:it) locale(alligator:ja) locale(alligator:ka) locale(alligator:ko) locale(alligator:lt) locale(alligator:nl) locale(alligator:nn) locale(alligator:pa) locale(alligator:pl) locale(alligator:pt) locale(alligator:pt_BR) locale(alligator:ru) locale(alligator:sk) locale(alligator:sl) locale(alligator:sv) locale(alligator:tr) locale(alligator:uk) locale(alligator:zh_CN) locale(alligator:zh_TW)"
RDEPENDS:${PN} += "alligator"

inherit rpm
