SUMMARY = "Translations for package soundconverter"
DESCRIPTION = "Provides translations for the 'soundconverter' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "soundconverter-lang-4.0.3-1.5.noarch.rpm"
RPM_HASH = "584c9d35487968b8bef6e6004e917befc954bf6007efc2fc7b0b00ad23c83efa8811b7dcf3f1f31de85849851aace2845b740cc5d128e1c7a711bc9014b268cf"
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
