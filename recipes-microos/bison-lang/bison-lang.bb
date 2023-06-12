SUMMARY = "Translations for package bison"
DESCRIPTION = "Provides translations for the 'bison' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "bison-lang-3.8.2-3.3.noarch.rpm"
RPM_HASH = "8d5b6d7287538e8703abe7f336410697be943be07586bc093e4f6af9c69377cdfef9a53c2ba25f06d1ad712fb228d2af2864126b38cac6d78fb2ae5f5baad6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bison-lang \
bison-lang-all \
locale(bison:af) \
locale(bison:ast) \
locale(bison:be) \
locale(bison:bg) \
locale(bison:ca) \
locale(bison:cs) \
locale(bison:da) \
locale(bison:de) \
locale(bison:el) \
locale(bison:eo) \
locale(bison:es) \
locale(bison:et) \
locale(bison:eu) \
locale(bison:fi) \
locale(bison:fr) \
locale(bison:ga) \
locale(bison:gl) \
locale(bison:hr) \
locale(bison:hu) \
locale(bison:ia) \
locale(bison:id) \
locale(bison:it) \
locale(bison:ja) \
locale(bison:ko) \
locale(bison:lt) \
locale(bison:lv) \
locale(bison:ms) \
locale(bison:nb) \
locale(bison:nl) \
locale(bison:pl) \
locale(bison:pt) \
locale(bison:pt_BR) \
locale(bison:ro) \
locale(bison:ru) \
locale(bison:sk) \
locale(bison:sl) \
locale(bison:sq) \
locale(bison:sr) \
locale(bison:sv) \
locale(bison:ta) \
locale(bison:th) \
locale(bison:tr) \
locale(bison:uk) \
locale(bison:vi) \
locale(bison:zh_CN) \
locale(bison:zh_TW)"
RDEPENDS:${PN} += "bison"

inherit rpm
