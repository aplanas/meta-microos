SUMMARY = "Translations for package mailimporter"
DESCRIPTION = "Provides translations for the 'mailimporter' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "mailimporter-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "3db7707e3d9efb0dfdb8cc6e06e4c65c5abca523b85aeed3cd5bb7ca6e46bb184bc043e0a8b97357f282e2197abdc492eb640c4fa7d15f9d9c48709e644508bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mailimporter:af) \
locale(mailimporter:ar) \
locale(mailimporter:be) \
locale(mailimporter:bg) \
locale(mailimporter:br) \
locale(mailimporter:bs) \
locale(mailimporter:ca) \
locale(mailimporter:ca@valencia) \
locale(mailimporter:cs) \
locale(mailimporter:cy) \
locale(mailimporter:da) \
locale(mailimporter:de) \
locale(mailimporter:el) \
locale(mailimporter:en_GB) \
locale(mailimporter:eo) \
locale(mailimporter:es) \
locale(mailimporter:et) \
locale(mailimporter:eu) \
locale(mailimporter:fa) \
locale(mailimporter:fi) \
locale(mailimporter:fr) \
locale(mailimporter:ga) \
locale(mailimporter:gl) \
locale(mailimporter:he) \
locale(mailimporter:hi) \
locale(mailimporter:hr) \
locale(mailimporter:hu) \
locale(mailimporter:ia) \
locale(mailimporter:is) \
locale(mailimporter:it) \
locale(mailimporter:ja) \
locale(mailimporter:ka) \
locale(mailimporter:kk) \
locale(mailimporter:km) \
locale(mailimporter:ko) \
locale(mailimporter:lt) \
locale(mailimporter:lv) \
locale(mailimporter:mai) \
locale(mailimporter:mk) \
locale(mailimporter:mr) \
locale(mailimporter:ms) \
locale(mailimporter:nb) \
locale(mailimporter:nds) \
locale(mailimporter:ne) \
locale(mailimporter:nl) \
locale(mailimporter:nn) \
locale(mailimporter:pa) \
locale(mailimporter:pl) \
locale(mailimporter:pt) \
locale(mailimporter:pt_BR) \
locale(mailimporter:ro) \
locale(mailimporter:ru) \
locale(mailimporter:sk) \
locale(mailimporter:sl) \
locale(mailimporter:sq) \
locale(mailimporter:sr) \
locale(mailimporter:sr@ijekavian) \
locale(mailimporter:sr@ijekavianlatin) \
locale(mailimporter:sr@latin) \
locale(mailimporter:sv) \
locale(mailimporter:ta) \
locale(mailimporter:th) \
locale(mailimporter:tr) \
locale(mailimporter:ug) \
locale(mailimporter:uk) \
locale(mailimporter:zh_CN) \
locale(mailimporter:zh_TW) \
mailimporter-lang \
mailimporter-lang-all"

RDEPENDS:${PN} += "mailimporter"

inherit rpm
