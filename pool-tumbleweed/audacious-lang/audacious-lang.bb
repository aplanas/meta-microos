SUMMARY = "Translations for package audacious"
DESCRIPTION = "Provides translations for the 'audacious' package."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "audacious-lang-4.3-1.3.noarch.rpm"
RPM_HASH = "4d89d711751570e6cffc646aa918ee774c93dcd870f7c245a0f63b0deba9b1085f6f4341eb80ae1cb5436f6db88dc97c9ec04c9d0509aa24a7c8f8d80f86f53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacious-lang \
audacious-lang-all \
locale(audacious:af) \
locale(audacious:ar) \
locale(audacious:be) \
locale(audacious:bg) \
locale(audacious:ca) \
locale(audacious:cs) \
locale(audacious:da) \
locale(audacious:de) \
locale(audacious:el) \
locale(audacious:en_GB) \
locale(audacious:es) \
locale(audacious:es_AR) \
locale(audacious:es_MX) \
locale(audacious:et) \
locale(audacious:eu) \
locale(audacious:fi) \
locale(audacious:fr) \
locale(audacious:gl) \
locale(audacious:hu) \
locale(audacious:it) \
locale(audacious:ja) \
locale(audacious:ko) \
locale(audacious:lt) \
locale(audacious:lv) \
locale(audacious:ms) \
locale(audacious:nl) \
locale(audacious:pl) \
locale(audacious:pt_BR) \
locale(audacious:pt_PT) \
locale(audacious:ro) \
locale(audacious:ru) \
locale(audacious:si) \
locale(audacious:sk) \
locale(audacious:sl) \
locale(audacious:sq) \
locale(audacious:sr) \
locale(audacious:sv) \
locale(audacious:ta) \
locale(audacious:tr) \
locale(audacious:uk) \
locale(audacious:zh_CN) \
locale(audacious:zh_TW)"

RDEPENDS:${PN} += "audacious"

inherit rpm
