SUMMARY = "Translations for package blanket"
DESCRIPTION = "Provides translations for the 'blanket' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "blanket-lang-0.6.0-1.4.noarch.rpm"
RPM_HASH = "e1cfe1c9fa67b9b6ee1aad1a9afb79a6502699db816ce685c3c1a6207c8702334aa0889093c9b997811937daf86f59c33eee64fc03146f8b9286766acb73b837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blanket-lang \
blanket-lang-all \
locale(blanket:ar) \
locale(blanket:ca) \
locale(blanket:cs) \
locale(blanket:de) \
locale(blanket:eo) \
locale(blanket:es) \
locale(blanket:eu) \
locale(blanket:fa) \
locale(blanket:fi) \
locale(blanket:fr) \
locale(blanket:ga) \
locale(blanket:gl) \
locale(blanket:hi) \
locale(blanket:hr) \
locale(blanket:hu) \
locale(blanket:id) \
locale(blanket:it) \
locale(blanket:ja) \
locale(blanket:ka) \
locale(blanket:ko) \
locale(blanket:ne) \
locale(blanket:nl) \
locale(blanket:oc) \
locale(blanket:pl) \
locale(blanket:pt) \
locale(blanket:pt_BR) \
locale(blanket:ru_RU) \
locale(blanket:sk) \
locale(blanket:sr) \
locale(blanket:sv) \
locale(blanket:ta) \
locale(blanket:tr) \
locale(blanket:uk) \
locale(blanket:zh_CN)"
RDEPENDS:${PN} += "blanket"

inherit rpm
