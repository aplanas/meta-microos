SUMMARY = "Translations for package libKPim5Mime5"
DESCRIPTION = "Provides translations for the 'libKPim5Mime5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Mime5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ed5ed4942fc486fc1ebb92ef126cbc7c7476eb600911d5159d2a8353ea0ab9604fba4146b813fb02ba1065a9cc9fca819b7e517729d1015b5823d6cb9b3a0168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5Mime5-lang \
libKPim5Mime5-lang-all \
locale(libKPim5Mime5:ar) \
locale(libKPim5Mime5:be) \
locale(libKPim5Mime5:bg) \
locale(libKPim5Mime5:br) \
locale(libKPim5Mime5:bs) \
locale(libKPim5Mime5:ca) \
locale(libKPim5Mime5:ca@valencia) \
locale(libKPim5Mime5:cs) \
locale(libKPim5Mime5:cy) \
locale(libKPim5Mime5:da) \
locale(libKPim5Mime5:de) \
locale(libKPim5Mime5:el) \
locale(libKPim5Mime5:en_GB) \
locale(libKPim5Mime5:eo) \
locale(libKPim5Mime5:es) \
locale(libKPim5Mime5:et) \
locale(libKPim5Mime5:eu) \
locale(libKPim5Mime5:fa) \
locale(libKPim5Mime5:fi) \
locale(libKPim5Mime5:fr) \
locale(libKPim5Mime5:ga) \
locale(libKPim5Mime5:gl) \
locale(libKPim5Mime5:hi) \
locale(libKPim5Mime5:hu) \
locale(libKPim5Mime5:ia) \
locale(libKPim5Mime5:it) \
locale(libKPim5Mime5:ja) \
locale(libKPim5Mime5:ka) \
locale(libKPim5Mime5:kk) \
locale(libKPim5Mime5:km) \
locale(libKPim5Mime5:ko) \
locale(libKPim5Mime5:lt) \
locale(libKPim5Mime5:lv) \
locale(libKPim5Mime5:mk) \
locale(libKPim5Mime5:mr) \
locale(libKPim5Mime5:ms) \
locale(libKPim5Mime5:nb) \
locale(libKPim5Mime5:nds) \
locale(libKPim5Mime5:ne) \
locale(libKPim5Mime5:nl) \
locale(libKPim5Mime5:nn) \
locale(libKPim5Mime5:pa) \
locale(libKPim5Mime5:pl) \
locale(libKPim5Mime5:pt) \
locale(libKPim5Mime5:pt_BR) \
locale(libKPim5Mime5:ro) \
locale(libKPim5Mime5:ru) \
locale(libKPim5Mime5:sk) \
locale(libKPim5Mime5:sl) \
locale(libKPim5Mime5:sq) \
locale(libKPim5Mime5:sr) \
locale(libKPim5Mime5:sr@ijekavian) \
locale(libKPim5Mime5:sr@ijekavianlatin) \
locale(libKPim5Mime5:sr@latin) \
locale(libKPim5Mime5:sv) \
locale(libKPim5Mime5:ta) \
locale(libKPim5Mime5:th) \
locale(libKPim5Mime5:tr) \
locale(libKPim5Mime5:ug) \
locale(libKPim5Mime5:uk) \
locale(libKPim5Mime5:wa) \
locale(libKPim5Mime5:zh_CN) \
locale(libKPim5Mime5:zh_TW)"

RDEPENDS:${PN} += "libKPim5Mime5"

inherit rpm
