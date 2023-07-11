SUMMARY = "Translations for package gimp-plugin-lqr"
DESCRIPTION = "Provides translations for the 'gimp-plugin-lqr' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "gimp-plugin-lqr-lang-0.7.2-6.14.noarch.rpm"
RPM_HASH = "cf926b80ed7b4758c16735756b3ccc02c957ffe3cb5bfcb6c0065c33e178c755c0c93500007e191d550d86c02f693ffcd2b0369b62d614cd050e9066fb27c999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-plugin-lqr-lang \
gimp-plugin-lqr-lang-all \
locale-gimp-plugin-lqr-de \
locale-gimp-plugin-lqr-es-AR \
locale-gimp-plugin-lqr-es-ES \
locale-gimp-plugin-lqr-fr \
locale-gimp-plugin-lqr-hu \
locale-gimp-plugin-lqr-it \
locale-gimp-plugin-lqr-nb-NO \
locale-gimp-plugin-lqr-pt-BR \
locale-gimp-plugin-lqr-ro \
locale-gimp-plugin-lqr-ru \
locale-gimp-plugin-lqr-sr \
locale-gimp-plugin-lqr-zh-CN \
locale-gimp-plugin-lqr-zh-TW"

RDEPENDS:${PN} += "gimp-plugin-lqr"

inherit rpm
