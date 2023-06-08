SUMMARY = "Translations for package calindori"
DESCRIPTION = "Provides translations for the 'calindori' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "calindori-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e19021501650e288ee70da534bce8c1ad6b5bb4dd20b3d450469a587fbcbba3c4f324fcda3948dae92a52a6b19dcdfc50bd1697c508805e158f30c8b0c6076d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calindori-lang calindori-lang-all locale(calindori:ca) locale(calindori:ca@valencia) locale(calindori:cs) locale(calindori:da) locale(calindori:de) locale(calindori:el) locale(calindori:en_GB) locale(calindori:es) locale(calindori:et) locale(calindori:eu) locale(calindori:fi) locale(calindori:fr) locale(calindori:gl) locale(calindori:ia) locale(calindori:it) locale(calindori:ja) locale(calindori:ka) locale(calindori:ko) locale(calindori:lt) locale(calindori:nl) locale(calindori:nn) locale(calindori:pa) locale(calindori:pl) locale(calindori:pt) locale(calindori:pt_BR) locale(calindori:ru) locale(calindori:sk) locale(calindori:sl) locale(calindori:sv) locale(calindori:tr) locale(calindori:uk) locale(calindori:zh_CN) locale(calindori:zh_TW)"
RDEPENDS:${PN} += "calindori"

inherit rpm
