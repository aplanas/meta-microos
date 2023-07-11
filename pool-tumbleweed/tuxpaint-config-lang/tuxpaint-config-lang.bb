SUMMARY = "Translations for package tuxpaint-config"
DESCRIPTION = "Provides translations for the 'tuxpaint-config' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.18"

RPM_NAME = "tuxpaint-config-lang-0.0.18-1.8.noarch.rpm"
RPM_HASH = "696592b92f6575781df084363a8697a5c3c43e8932a245cbf0136eee8c99bc9e569b6255f3ca96566168fe1b9776179cd2253ededcb936d359bbc24ac249c532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tuxpaint-config-ar \
locale-tuxpaint-config-ast \
locale-tuxpaint-config-bg \
locale-tuxpaint-config-ca \
locale-tuxpaint-config-cs \
locale-tuxpaint-config-da \
locale-tuxpaint-config-de \
locale-tuxpaint-config-el \
locale-tuxpaint-config-en-GB \
locale-tuxpaint-config-eo \
locale-tuxpaint-config-es \
locale-tuxpaint-config-eu \
locale-tuxpaint-config-fi \
locale-tuxpaint-config-fr \
locale-tuxpaint-config-gd \
locale-tuxpaint-config-gl \
locale-tuxpaint-config-hi \
locale-tuxpaint-config-id \
locale-tuxpaint-config-is \
locale-tuxpaint-config-it \
locale-tuxpaint-config-ja \
locale-tuxpaint-config-ka \
locale-tuxpaint-config-lv \
locale-tuxpaint-config-ms \
locale-tuxpaint-config-nl \
locale-tuxpaint-config-nn \
locale-tuxpaint-config-pl \
locale-tuxpaint-config-pt \
locale-tuxpaint-config-pt-BR \
locale-tuxpaint-config-ro \
locale-tuxpaint-config-ru \
locale-tuxpaint-config-sk \
locale-tuxpaint-config-sl \
locale-tuxpaint-config-sq \
locale-tuxpaint-config-sr \
locale-tuxpaint-config-sr@latin \
locale-tuxpaint-config-sv \
locale-tuxpaint-config-tr \
locale-tuxpaint-config-uk \
locale-tuxpaint-config-vi \
locale-tuxpaint-config-zh-TW \
tuxpaint-config-lang \
tuxpaint-config-lang-all"

RDEPENDS:${PN} += "tuxpaint-config"

inherit rpm
