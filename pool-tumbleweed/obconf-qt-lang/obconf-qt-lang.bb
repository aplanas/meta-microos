SUMMARY = "Translations for package obconf-qt"
DESCRIPTION = "Provides translations for the 'obconf-qt' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "obconf-qt-lang-0.16.2-1.8.noarch.rpm"
RPM_HASH = "c5209d68ad75f886a52ae80e1c62eb265e3d0dd4828bc52f14500478a9187186b0acf5b4f9fb3575ea3d899534180be9aa2fbeb5ebb777b2580b600b521c83f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obconf-qt-lang \
obconf-qt-lang-all"

RDEPENDS:${PN} += "obconf-qt"

inherit rpm
