SUMMARY = "Translations for package calindori"
DESCRIPTION = "Provides translations for the 'calindori' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "calindori-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "d057eef67524965417001212c29dedd547bc08c70e8572edf433c196e00ac6663868cc9ca7807844ccd416d5e80f92ab180c706f5daaf06aaaaf344822d7f984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calindori-lang calindori-lang-all locale(calindori:ca) locale(calindori:ca@valencia) locale(calindori:cs) locale(calindori:da) locale(calindori:de) locale(calindori:el) locale(calindori:en_GB) locale(calindori:es) locale(calindori:et) locale(calindori:eu) locale(calindori:fi) locale(calindori:fr) locale(calindori:gl) locale(calindori:ia) locale(calindori:it) locale(calindori:ja) locale(calindori:ka) locale(calindori:ko) locale(calindori:lt) locale(calindori:nl) locale(calindori:nn) locale(calindori:pa) locale(calindori:pl) locale(calindori:pt) locale(calindori:pt_BR) locale(calindori:ru) locale(calindori:sk) locale(calindori:sl) locale(calindori:sv) locale(calindori:tr) locale(calindori:uk) locale(calindori:zh_CN) locale(calindori:zh_TW)"
RDEPENDS:${PN} += "calindori"

inherit rpm
