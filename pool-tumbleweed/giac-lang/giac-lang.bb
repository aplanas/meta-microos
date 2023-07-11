SUMMARY = "Translations for package giac"
DESCRIPTION = "Provides translations for the 'giac' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-lang-1.9.0.27-4.6.noarch.rpm"
RPM_HASH = "411f2e81eb9cd4572e4cf4a4a1ea8a25850a645b9bb1abeda641b645917abd8c19fd0b642046416c84a2e4a27dc22eadcb9222e8c3fb317418b2f6697f9340f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "giac-lang \
giac-lang-all \
locale-giac-de \
locale-giac-el \
locale-giac-en \
locale-giac-es \
locale-giac-fr \
locale-giac-it \
locale-giac-pt \
locale-giac-zh"

RDEPENDS:${PN} += "giac"

inherit rpm
