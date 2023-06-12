SUMMARY = "Translations for package mednafen"
DESCRIPTION = "Provides translations for the 'mednafen' package."
LICENSE = "GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "mednafen-lang-1.31.0-1.4.noarch.rpm"
RPM_HASH = "a0786fb9bf0cc9f67d0a002e2ba367e42d24037c2f951e13ee249ecad0f284a4a0af106ccd616a9bce13617288b2003e2ae82de76fc6f8b99bea9866374c3923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mednafen:de) \
locale(mednafen:es) \
locale(mednafen:ru) \
mednafen-lang \
mednafen-lang-all"
RDEPENDS:${PN} += "mednafen"

inherit rpm
