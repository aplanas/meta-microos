SUMMARY = "Translations for package libpurple-plugin-sipe"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-sipe' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "libpurple-plugin-sipe-lang-1.25.0-2.12.noarch.rpm"
RPM_HASH = "17cfb57062b63d12dd2a6aa869cd414db6406043635de3e396d2f8c948a9134981cace63cbe1e4ff1bd3ae8d253aaff54735b341e46de79959531eed176fbe40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-sipe-lang \
libpurple-plugin-sipe-lang-all \
locale-libpurple-plugin-sipe-ar \
locale-libpurple-plugin-sipe-cs \
locale-libpurple-plugin-sipe-da \
locale-libpurple-plugin-sipe-de \
locale-libpurple-plugin-sipe-el \
locale-libpurple-plugin-sipe-es \
locale-libpurple-plugin-sipe-fi \
locale-libpurple-plugin-sipe-fr \
locale-libpurple-plugin-sipe-fr-CA \
locale-libpurple-plugin-sipe-hi \
locale-libpurple-plugin-sipe-hu \
locale-libpurple-plugin-sipe-it \
locale-libpurple-plugin-sipe-ja \
locale-libpurple-plugin-sipe-ko \
locale-libpurple-plugin-sipe-lt \
locale-libpurple-plugin-sipe-nb \
locale-libpurple-plugin-sipe-nl \
locale-libpurple-plugin-sipe-pl \
locale-libpurple-plugin-sipe-pt \
locale-libpurple-plugin-sipe-pt-BR \
locale-libpurple-plugin-sipe-ro \
locale-libpurple-plugin-sipe-ru \
locale-libpurple-plugin-sipe-sv \
locale-libpurple-plugin-sipe-ta \
locale-libpurple-plugin-sipe-te \
locale-libpurple-plugin-sipe-tr \
locale-libpurple-plugin-sipe-zh-CN \
locale-libpurple-plugin-sipe-zh-TW"

RDEPENDS:${PN} += "libpurple-plugin-sipe"

inherit rpm
