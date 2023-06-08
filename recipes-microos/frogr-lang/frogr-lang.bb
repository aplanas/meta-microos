SUMMARY = "Translations for package frogr"
DESCRIPTION = "Provides translations for the 'frogr' package."
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "frogr-lang-1.7-1.7.noarch.rpm"
RPM_HASH = "e0b104c52fe0e334e2f47a8a76ccc3ef805d272b32a0f457a89c23a3ace271b7e3ffcb5e60ce1a1aa33098bcb69053d8bfde7b201a0928af96a1fafa723d9d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frogr-lang frogr-lang-all locale(frogr:bs) locale(frogr:ca) locale(frogr:cs) locale(frogr:da) locale(frogr:de) locale(frogr:el) locale(frogr:en_GB) locale(frogr:es) locale(frogr:eu) locale(frogr:fi) locale(frogr:fr) locale(frogr:fur) locale(frogr:gl) locale(frogr:hu) locale(frogr:id) locale(frogr:is) locale(frogr:it) locale(frogr:ja) locale(frogr:lv) locale(frogr:nb) locale(frogr:nl) locale(frogr:nn) locale(frogr:oc) locale(frogr:pl) locale(frogr:pt) locale(frogr:pt_BR) locale(frogr:ro) locale(frogr:ru) locale(frogr:sl) locale(frogr:sr) locale(frogr:sr@latin) locale(frogr:sv) locale(frogr:te) locale(frogr:tr) locale(frogr:uk) locale(frogr:zh_CN)"
RDEPENDS:${PN} += "frogr"

inherit rpm
