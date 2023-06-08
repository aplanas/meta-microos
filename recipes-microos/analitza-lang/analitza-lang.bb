SUMMARY = "Translations for package analitza"
DESCRIPTION = "Provides translations for the 'analitza' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "analitza-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "5cc76987f1bb632d18ede6ff3f17e314c7f7c8de776dcf4db92b28baecb5003f9a33cded8a2710b00cb45e227f0c02dfc918d45852155e7c19921c133d1806b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analitza-lang analitza-lang-all locale(analitza:ar) locale(analitza:bs) locale(analitza:ca) locale(analitza:ca@valencia) locale(analitza:cs) locale(analitza:da) locale(analitza:de) locale(analitza:el) locale(analitza:en_GB) locale(analitza:es) locale(analitza:et) locale(analitza:eu) locale(analitza:fi) locale(analitza:fr) locale(analitza:ga) locale(analitza:gl) locale(analitza:hu) locale(analitza:ia) locale(analitza:it) locale(analitza:ja) locale(analitza:ka) locale(analitza:kk) locale(analitza:ko) locale(analitza:lt) locale(analitza:lv) locale(analitza:ml) locale(analitza:mr) locale(analitza:nb) locale(analitza:nds) locale(analitza:nl) locale(analitza:nn) locale(analitza:pl) locale(analitza:pt) locale(analitza:pt_BR) locale(analitza:ru) locale(analitza:sk) locale(analitza:sl) locale(analitza:sv) locale(analitza:tr) locale(analitza:ug) locale(analitza:uk) locale(analitza:zh_CN) locale(analitza:zh_TW)"
RDEPENDS:${PN} += "analitza"

inherit rpm
