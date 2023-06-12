SUMMARY = "Translations for package amtk-5"
DESCRIPTION = "Provides translations for the 'amtk-5' package."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "amtk-5-lang-5.6.1-1.1.noarch.rpm"
RPM_HASH = "8ce396c7a533b680294adf44dbd3b9e0d9c7371206820416fb18d73a18e04df73d6d115bcee3cceb12f1e6ec4bbee692804be8f9494f340c1da168fef85f7fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amtk-5-lang \
amtk-5-lang-all \
locale(amtk-5:ca) \
locale(amtk-5:cs) \
locale(amtk-5:da) \
locale(amtk-5:de) \
locale(amtk-5:el) \
locale(amtk-5:en_GB) \
locale(amtk-5:es) \
locale(amtk-5:eu) \
locale(amtk-5:fr) \
locale(amtk-5:fur) \
locale(amtk-5:hr) \
locale(amtk-5:hu) \
locale(amtk-5:id) \
locale(amtk-5:it) \
locale(amtk-5:ja) \
locale(amtk-5:lt) \
locale(amtk-5:ms) \
locale(amtk-5:nl) \
locale(amtk-5:pl) \
locale(amtk-5:pt) \
locale(amtk-5:pt_BR) \
locale(amtk-5:ro) \
locale(amtk-5:ru) \
locale(amtk-5:sl) \
locale(amtk-5:sr) \
locale(amtk-5:sv) \
locale(amtk-5:tr) \
locale(amtk-5:uk) \
locale(amtk-5:zh_CN)"
RDEPENDS:${PN} += "amtk-5"

inherit rpm
