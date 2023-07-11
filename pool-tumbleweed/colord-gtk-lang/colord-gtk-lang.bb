SUMMARY = "Translations for package colord-gtk"
DESCRIPTION = "Provides translations for the 'colord-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "colord-gtk-lang-0.3.0-2.1.noarch.rpm"
RPM_HASH = "52b7b84187e3b69e70c08f8094aea53206716de6a85e536bfc249a7172b7b8bef40df9539d18058f694b555dab1a6d17cd8817e4e0096a44d87843e55b7f728c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-gtk-lang \
colord-gtk-lang-all \
locale-colord-gtk-en-GB"

RDEPENDS:${PN} += "colord-gtk"

inherit rpm
