SUMMARY = "Translations for package goocanvas2"
DESCRIPTION = "Provides translations for the 'goocanvas2' package."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "goocanvas2-lang-2.0.4-2.9.noarch.rpm"
RPM_HASH = "52f5a27fa1fb7c2ad6c997c3da5851dfd7a075af4aefb90db7a7e88985e9003aaac8ea8dbeae1f693ab418a5248807d566ddee0456a3bbecdd5d501b99034a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goocanvas2-lang \
goocanvas2-lang-all \
locale(goocanvas2:cs) \
locale(goocanvas2:de) \
locale(goocanvas2:en_GB) \
locale(goocanvas2:es) \
locale(goocanvas2:id) \
locale(goocanvas2:ja) \
locale(goocanvas2:pl) \
locale(goocanvas2:pt_BR) \
locale(goocanvas2:sr) \
locale(goocanvas2:sv)"

RDEPENDS:${PN} += "goocanvas2"

inherit rpm
