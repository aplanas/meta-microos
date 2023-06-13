SUMMARY = "Translations for package libosinfo"
DESCRIPTION = "Provides translations for the 'libosinfo' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-lang-1.10.0-3.3.noarch.rpm"
RPM_HASH = "10ec181240f3cc89498df92c1d77c7b818c5814eb73d0b4114d54626057a879cc50b0d332f0bf374dbda487d17c1d1119a27cd29c8d18bccdd0d3223d701e8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libosinfo-lang \
libosinfo-lang-all \
locale(libosinfo:ca) \
locale(libosinfo:cs) \
locale(libosinfo:de) \
locale(libosinfo:es) \
locale(libosinfo:eu) \
locale(libosinfo:fi) \
locale(libosinfo:fr) \
locale(libosinfo:fur) \
locale(libosinfo:id) \
locale(libosinfo:it) \
locale(libosinfo:ja) \
locale(libosinfo:ko) \
locale(libosinfo:pl) \
locale(libosinfo:pt_BR) \
locale(libosinfo:pt_PT) \
locale(libosinfo:ru) \
locale(libosinfo:si) \
locale(libosinfo:tr) \
locale(libosinfo:uk)"

RDEPENDS:${PN} += "libosinfo"

inherit rpm
