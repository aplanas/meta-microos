SUMMARY = "Translations for package zvbi"
DESCRIPTION = "Provides translations for the 'zvbi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "zvbi-lang-0.2.41-2.2.noarch.rpm"
RPM_HASH = "306f19121c5d005ff1ebdebd364feee0f72852fbf2758f89d4a94adb33dacdcafb88633db49996d71db9783c3b2ea715942327db3d1cda19304c1e71ac7414f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zvbi-de \
locale-zvbi-en@boldquot \
locale-zvbi-en@quot \
locale-zvbi-es \
locale-zvbi-fr \
locale-zvbi-it \
locale-zvbi-ka \
locale-zvbi-nl \
locale-zvbi-pl \
zvbi-lang \
zvbi-lang-all"

RDEPENDS:${PN} += "zvbi"

inherit rpm
