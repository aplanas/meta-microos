SUMMARY = "Translations for package goocanvas"
DESCRIPTION = "Provides translations for the 'goocanvas' package."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "goocanvas-lang-3.0.0-2.9.noarch.rpm"
RPM_HASH = "c23d4e562361dedc5371a10d9ada4daee772e09f356078d6918ac705b31f82a130863d7be6fe4d8e3c037334de36352337ddf5661f5060cb7b09dd4e5bc200d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goocanvas-lang \
goocanvas-lang-all \
locale(goocanvas:cs) \
locale(goocanvas:de) \
locale(goocanvas:el) \
locale(goocanvas:en_GB) \
locale(goocanvas:es) \
locale(goocanvas:eu) \
locale(goocanvas:hu) \
locale(goocanvas:id) \
locale(goocanvas:ja) \
locale(goocanvas:pl) \
locale(goocanvas:pt_BR) \
locale(goocanvas:sr) \
locale(goocanvas:sv)"
RDEPENDS:${PN} += "goocanvas"

inherit rpm
