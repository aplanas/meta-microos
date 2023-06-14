SUMMARY = "Translations for package soundconverter"
DESCRIPTION = "Provides translations for the 'soundconverter' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "soundconverter-lang-4.0.3-1.4.noarch.rpm"
RPM_HASH = "bfdca7077c78acf1b744c518baa8ab612c15ea021ac5bff13646245dbac13a59f50cb798e409610a6c21fc5abc90021957deb50910fbf158e46aaa1c8fa2b703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-soundconverter-ar \
locale-soundconverter-ast \
locale-soundconverter-bg \
locale-soundconverter-br \
locale-soundconverter-ca \
locale-soundconverter-cs \
locale-soundconverter-da \
locale-soundconverter-de \
locale-soundconverter-el \
locale-soundconverter-en-AU \
locale-soundconverter-en-CA \
locale-soundconverter-en-GB \
locale-soundconverter-eo \
locale-soundconverter-es \
locale-soundconverter-et \
locale-soundconverter-eu \
locale-soundconverter-fa \
locale-soundconverter-fi \
locale-soundconverter-fr \
locale-soundconverter-fr-CA \
locale-soundconverter-fr-FR \
locale-soundconverter-gl \
locale-soundconverter-he \
locale-soundconverter-hi \
locale-soundconverter-hu \
locale-soundconverter-it \
locale-soundconverter-ja \
locale-soundconverter-ko \
locale-soundconverter-lt \
locale-soundconverter-lv \
locale-soundconverter-ml \
locale-soundconverter-ms \
locale-soundconverter-nb \
locale-soundconverter-nl \
locale-soundconverter-pl \
locale-soundconverter-pt \
locale-soundconverter-pt-BR \
locale-soundconverter-ro \
locale-soundconverter-ru \
locale-soundconverter-sk \
locale-soundconverter-sl \
locale-soundconverter-sq \
locale-soundconverter-sr \
locale-soundconverter-sr@latin \
locale-soundconverter-sv \
locale-soundconverter-te \
locale-soundconverter-tr \
locale-soundconverter-uk \
locale-soundconverter-vi \
locale-soundconverter-zh-CN \
locale-soundconverter-zh-TW \
soundconverter-lang \
soundconverter-lang-all"

RDEPENDS:${PN} += "soundconverter"

inherit rpm
