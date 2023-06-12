SUMMARY = "Translations for package guake"
DESCRIPTION = "Provides translations for the 'guake' package."
LICENSE = "GPL-2.0-only"

PV = "3.9.0"

RPM_NAME = "guake-lang-3.9.0-2.1.noarch.rpm"
RPM_HASH = "819b67cb49f0813c4b8ec7ae546671e6851dd85c2bec49a9101082b9339e016073adc02d9dc9ada8f9796c8ed29f7af56a9f9b2a7420f28168cf1b9ed1236aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake-lang \
guake-lang-all \
locale(guake:ca) \
locale(guake:cs) \
locale(guake:de) \
locale(guake:el) \
locale(guake:es) \
locale(guake:fa) \
locale(guake:fi) \
locale(guake:fr) \
locale(guake:gl) \
locale(guake:hr) \
locale(guake:hu) \
locale(guake:id) \
locale(guake:it) \
locale(guake:ja) \
locale(guake:ko) \
locale(guake:nb) \
locale(guake:nl) \
locale(guake:pa) \
locale(guake:pl) \
locale(guake:pt_BR) \
locale(guake:ru) \
locale(guake:sv) \
locale(guake:tr) \
locale(guake:uk) \
locale(guake:zh_CN) \
locale(guake:zh_TW)"
RDEPENDS:${PN} += "guake"

inherit rpm
