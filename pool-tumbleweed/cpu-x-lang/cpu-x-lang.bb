SUMMARY = "Translations for package cpu-x"
DESCRIPTION = "Provides translations for the 'cpu-x' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-lang-4.5.3-1.1.noarch.rpm"
RPM_HASH = "f4a900e95221af0b45d97a2612cfec691ba29d5ef790c7089cee549958c8eb9c9515321983092304f7b3a2813c35d03055eebd6315f9bfb0d2f65d0e4982b2b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-lang \
cpu-x-lang-all \
locale(cpu-x:ar) \
locale(cpu-x:bg) \
locale(cpu-x:ca) \
locale(cpu-x:cs_CZ) \
locale(cpu-x:da) \
locale(cpu-x:de) \
locale(cpu-x:el) \
locale(cpu-x:es) \
locale(cpu-x:fa) \
locale(cpu-x:fi) \
locale(cpu-x:fr) \
locale(cpu-x:hu) \
locale(cpu-x:id) \
locale(cpu-x:it) \
locale(cpu-x:ja) \
locale(cpu-x:ka) \
locale(cpu-x:ko) \
locale(cpu-x:lv) \
locale(cpu-x:ml) \
locale(cpu-x:mr) \
locale(cpu-x:ms) \
locale(cpu-x:nb_NO) \
locale(cpu-x:nl) \
locale(cpu-x:pa) \
locale(cpu-x:pl) \
locale(cpu-x:pt) \
locale(cpu-x:pt_BR) \
locale(cpu-x:ro) \
locale(cpu-x:ru) \
locale(cpu-x:si) \
locale(cpu-x:sv) \
locale(cpu-x:ta) \
locale(cpu-x:tr) \
locale(cpu-x:uk) \
locale(cpu-x:zh) \
locale(cpu-x:zh_Hant)"

RDEPENDS:${PN} += "cpu-x"

inherit rpm
