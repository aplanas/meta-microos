SUMMARY = "Translations for package libdazzle"
DESCRIPTION = "Provides translations for the 'libdazzle' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-lang-3.44.0-1.7.noarch.rpm"
RPM_HASH = "1efdada9c692bab92934312edb5324a86aebf093e80a579458684e3c1c12df9ef8adacb467108cbf62649f7a78b10db0264f8ec4a193835012e4ee5049c89c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdazzle-lang \
libdazzle-lang-all \
locale(libdazzle:de) \
locale(libdazzle:es) \
locale(libdazzle:eu) \
locale(libdazzle:pl) \
locale(libdazzle:sv) \
locale(libdazzle:uk) \
locale(libdazzle:zh_CN)"

RDEPENDS:${PN} += "libdazzle"

inherit rpm
