SUMMARY = "Translations for package nfoview"
DESCRIPTION = "Provides translations for the 'nfoview' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.29"

RPM_NAME = "nfoview-lang-1.29-1.2.noarch.rpm"
RPM_HASH = "09a14682df24276a9010a4ffaa2dd9afd4f96a8af1de7e8d86748c173a7264c01817f4806eaad8125c8f7b9911ab786188f6cc094dfde62dfbf3f93861668894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nfoview:bg) \
locale(nfoview:br) \
locale(nfoview:cs) \
locale(nfoview:de) \
locale(nfoview:de_CH) \
locale(nfoview:el) \
locale(nfoview:es_ES) \
locale(nfoview:fi) \
locale(nfoview:fr) \
locale(nfoview:he) \
locale(nfoview:hu) \
locale(nfoview:it) \
locale(nfoview:nl) \
locale(nfoview:pl) \
locale(nfoview:pt_BR) \
locale(nfoview:pt_PT) \
locale(nfoview:ro) \
locale(nfoview:ru) \
locale(nfoview:sr) \
locale(nfoview:sv) \
locale(nfoview:tr) \
locale(nfoview:zh_CN) \
nfoview-lang \
nfoview-lang-all"

RDEPENDS:${PN} += "nfoview"

inherit rpm
