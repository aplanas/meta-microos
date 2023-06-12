SUMMARY = "Translations for package sed"
DESCRIPTION = "Provides translations for the 'sed' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.9"

RPM_NAME = "sed-lang-4.9-2.3.noarch.rpm"
RPM_HASH = "1957ec0e9f18ab0a7bf4a129e6848308a5ebc8d9df3669839f917a150e6560dee2d9e5d67bebe780aa54c17b3aa2a7c8620bbc8d09c2cfe65b9048ced33391c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(sed:af) \
locale(sed:ast) \
locale(sed:bg) \
locale(sed:ca) \
locale(sed:cs) \
locale(sed:da) \
locale(sed:de) \
locale(sed:el) \
locale(sed:eo) \
locale(sed:es) \
locale(sed:et) \
locale(sed:eu) \
locale(sed:fi) \
locale(sed:fr) \
locale(sed:ga) \
locale(sed:gl) \
locale(sed:he) \
locale(sed:hr) \
locale(sed:hu) \
locale(sed:id) \
locale(sed:it) \
locale(sed:ja) \
locale(sed:ka) \
locale(sed:ko) \
locale(sed:nb) \
locale(sed:nl) \
locale(sed:pl) \
locale(sed:pt) \
locale(sed:pt_BR) \
locale(sed:ro) \
locale(sed:ru) \
locale(sed:sk) \
locale(sed:sl) \
locale(sed:sr) \
locale(sed:sv) \
locale(sed:tr) \
locale(sed:uk) \
locale(sed:vi) \
locale(sed:zh_CN) \
locale(sed:zh_TW) \
sed-lang \
sed-lang-all"
RDEPENDS:${PN} += "sed"

inherit rpm
